/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *Compositor.
 * 
 * clase hija de Persona resive los atributos de la misma por lo que pose 
 * el metodo calcular salario pero aqui si se le implemanta y se lo desarroya
 * posee sus propios metodos para agregar clientes y cancionesTop100Billboard 
 * asi como los geter y seter de cada atributo
 * @author ROMEL
 */
public class Compositor extends Persona {
     //implementacion atributos
    private int numeroDeComposiciones;
    private Cancion[] cancionesTop100Billboard;
    private int cont;
    private Cantante[] clientes;
    private int contc;

    /**
     * constructor clase Compositor.
     * inicializa o da valores a los atributos que resive por parametro de entrada
     * @param numeroDeComposiciones -tipo int
     * @param cancionesTop100Billboard -tipo cancion
     * @param clientes -tipo cantante
     * @param codigo -tipo String
     * @param nombre -tipo String
     * @param apellido -tipo String
     * @param edad -tipo int
     * @param nacionalida -tipo String
     * @param salario .tipo double
     */
    public Compositor(int numeroDeComposiciones, Cancion[] cancionesTop100Billboard, Cantante[] clientes, String codigo, String nombre, String apellido, int edad, String nacionalida, double salario) {
        super(codigo, nombre, apellido, edad, nacionalida, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100Billboard = cancionesTop100Billboard;
        this.clientes = clientes;
    }
    
    /**
     * Constructor Compositor.
     * este contructor se encuentra vacio para ser llamado desde la clase principal 
     * y dar valores a sus atributos
     */
    public Compositor()
    {
        cancionesTop100Billboard=new Cancion[10];
        cont=0;
        clientes=new Cantante[10];
        contc=0;
    }

    /**
     * getNumeroDeComposiciones.
     * devuelve el valor o dato del atributo NumeroDeComposiciones
     * @return NumeroDeComposiciones 
     */
    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    /**
     * setNumeroDeComposiciones.
     * asigna valores o datos al atributo NumeroDeComposiciones
     * @param numeroDeComposiciones- tipo int
     */
    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    //hashCode de numeroDeComposiciones
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numeroDeComposiciones;
        return hash;
    }

    //equal del atributo numeroDeComposiciones
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compositor other = (Compositor) obj;
        if (this.numeroDeComposiciones != other.numeroDeComposiciones) {
            return false;
        }
        return true;
    }
    
    
    /**
    * metodo agregarCancion
    * se crean los objetos de la clase cancion desntro de esta clase para irlos 
    * guardando en el arreglo cancionesTop100Billboard[]
    * @param codigo -tipo int
    * @param titulo -tipo String
    * @param letra -tipo String
    * @param tiempoEnMinutos -tipo Double
    */
    public void agregarCancion(int codigo,String titulo,String letra,double tiempoEnMinutos)
    {
        if(cont<=10)
        {
            Cancion cancion=new Cancion();
            cancion.setCodigo(codigo);
            cancion.setTitulo(titulo);
            cancion.setLetra(letra);
            cancion.setTiempoEnMinutos(tiempoEnMinutos);
            
            cancionesTop100Billboard[cont]=cancion;
            cont++;
        }
        else{System.out.println("Has llegado al limite de Discos");}
    }
    
    /**
     * metodo agregarCliente.
     * se agrega cantantes al arreglo clientes[]
     * @param cliente .tipo cliente
     */
    public void agregarCliente(Cantante cliente)
    {
        if(contc<=10)
        {
            clientes[contc]=cliente;
            contc++;
        }
        else{System.out.println("has llegado al limite de clientes");}
    }
    

    /**
     * getCancionesTop100Billboard.
     * devuelve el valor o dato del atributo CancionesTop100Billboard
     * @return CancionesTop100Billboard
     */
    public Cancion[] getCancionesTop100Billboard() {
        return cancionesTop100Billboard;
    }
    
    /**
    * metodo calculoDeSalario.
    * calcula los aumentos del salario en caso de averslo solo si se cumplen 
    * siertas normas
    * @return salarioTotal
    */
    @Override
    public double calculoDeSalario() {
        int regalia=0;
        double aumento1=0;
        double aumento2=0;
        double aumento3=0;
        if(numeroDeComposiciones>5)
        {
            regalia=300;
        }
        if(cancionesTop100Billboard.length>0 && cancionesTop100Billboard.length<4)
        {
            aumento1=salario*0.1;
        }
        else{
            if(cancionesTop100Billboard.length>3 && cancionesTop100Billboard.length<7)
            {
                aumento2=salario*0.2;
            }
            else{
                if(cancionesTop100Billboard.length>6)
                    
                {
                    aumento3=salario*0.2;
                }
            }
        }          
        return (salario+regalia+aumento1+aumento2+aumento3);
    }

    /**
    * metodo toString.
    * devuelve una frase con los objetos de los atributos de la clase
    * @return atributos de la Persona 
    */
    @Override
    public String toString() {
        String cancionesTop100Billboard=" ";
        for (int i = 0; i < cont; i++) {
            cancionesTop100Billboard+=this.cancionesTop100Billboard[i]+"\n";  
        }
        String clientes=" ";
        for (int i = 0; i < contc; i++) {
            clientes+=this.clientes[i]+"\n";
        }
        return super.toString()+ "\nCompositor{" + "numeroDeComposiciones=" + numeroDeComposiciones + '}'+"\nCanciones:\n"+cancionesTop100Billboard;
    }
    
}
