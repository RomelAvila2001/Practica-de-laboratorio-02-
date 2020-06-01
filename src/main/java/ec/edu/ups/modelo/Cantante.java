/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *Cantante.
 * clase hija de Persona resive los atributos de la misma por lo que pose 
 * el metodo calcular salario pero aqui si se le implemanta y se lo desarroya
 * posee sus propios metodos para agragacion de una discografia 
 * asi como los geter y seter de cada atributo
 * @author ROMEL
 */
public class Cantante extends Persona {
    // declaracion de los metodos 
    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeConsiertos;
    private int numeroDeGiras;
    private Disco[] discografia;
    private int cont;
    
    /**
     * constructor clase Cantante.
     * inicializa o da valores a los atributos que resive por parametro de entrada
     * @param nombreArtistico -tipo String
     * @param generoMusical -tipo String
     * @param numeroDeSencillos-tipo int
     * @param numeroDeConsiertos -tipo int
     * @param numeroDeGiras -tipo int
     * @param discografia- tipo Disco
     * @param codigo -tipo String
     * @param nombre -tipo String
     * @param apellido -tipo String
     * @param edad -tipo int
     * @param nacionalida -tipo String
     * @param salario -tipo double
     */
    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConsiertos, int numeroDeGiras, Disco[] discografia, String codigo, String nombre, String apellido, int edad, String nacionalida, double salario) {
        super(codigo, nombre, apellido, edad, nacionalida, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConsiertos = numeroDeConsiertos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = discografia;
    }
    
    /**
     * Constructor Cantante.
     * este contructor se encuentra vacio para ser llamado desde la clase principal 
     * y dar valores a sus atributos
     */
    public Cantante(){
        discografia=new Disco[10];
        cont=0;
        
    }

    /**
     * get nombre artistico.
     * devuelve el valor o dato del atributo nombreArtistico
     * @return nombreartistico
     */
    public String getNombreArtistico() {
        return nombreArtistico;
    }

    /**
     * set nombre artistico.
     * asigna valores o datos al atributo nombreArtisco
     * @param nombreArtistico -tipo String
     */
    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    /**
     * get Genero Musical.
     * devuelve el valor o dato del atributo generoMusical
     * @return generoMusical
     */
    public String getGeneroMusical() {
        return generoMusical;
    }

    /**
     * set GeneroMusical.
     * asigna valores o datos al atributo gernoMusical
     * @param generoMusical -tipo String
     */
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    /**
     * get numero de sencillos.
     * devuelve el valor o dato del atributo numeroDeSencillos
     * @return numeroDeSensillos   
     */
    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }
    
    /**
     * set numeroDeSencillos.
     * asigna valores o datos al atributo numeroDeSencillos
     * @param numeroDeSencillos -tipo int
     */
    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }

    /**
     * get numero de conciertos.
     * devuelve el valor o dato del atributo numeroDeConciertos
     * @return numeroDeConciertos
     */
    public int getNumeroDeConsiertos() {
        return numeroDeConsiertos;
    }

    /**
     * set NumeroDeConsiertos.
     * asigna valores o datos al atributo numeroDeConsiertos
     * @param numeroDeConsiertos -tipo int 
     */
    public void setNumeroDeConsiertos(int numeroDeConsiertos) {
        this.numeroDeConsiertos = numeroDeConsiertos;
    }

    /**
     * get numero de giras.
     * devuelve el valor o dato del atributo numeroDeGiras
     * @return numeroDeGiras
     */
    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }

    /**
     * set NumeroDeGiras.
     * asigna valores o datos al atributo numeroDeGiras
     * @param numeroDeGiras -tipo int
     */
    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

    //hashCode de nombreArtistico
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombreArtistico);
        return hash;
    }

    //metodo equals del atributo nombreArtistico
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
        final Cantante other = (Cantante) obj;
        if (!Objects.equals(this.nombreArtistico, other.nombreArtistico)) {
            return false;
        }
        return true;
    }
    
    /**
     * metodo agregarDisco.
     * se crean los objetos de la clase disco desntro de esta clase para irlos 
     * guardando en el arreglo discografia[]
     * @param codigo -tipo int
     * @param nombre -tipo String
     * @param añoDeLanzamiento -tipo int
     */
    public void agregarDisco(int codigo, String nombre,int añoDeLanzamiento){
        if(cont<=10)
        {
            Disco disco=new Disco();
            disco.setCodigo(codigo);
            disco.setNombre(nombre);
            disco.setAñoDeLanzamiento(añoDeLanzamiento);
            discografia[cont]=disco;
            cont++;
        }
        else{System.out.println("Has llegado al limite de Discos");}
    }

    /**
     * get Discografia.
     * devuelve el valor o dato del arreglo discografia
     * @return -discografia 
     */
    public Disco[] getDiscografia() {
        return discografia;
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
        double aumento=0;
        double aumento2=0;
        int bonoExtra=0;
        if(numeroDeSencillos>10 && numeroDeGiras>3)
        {
            regalia=1000;
        }
        if(numeroDeSencillos>0 && numeroDeSencillos<11)
        {
            aumento= salario*0.5;
        }
        if(numeroDeGiras>0 && numeroDeGiras<4)
        {
            aumento2=salario*0.3;
        }
        if(discografia.length==5 && discografia.length>5)
        {
            bonoExtra=2000;
        }
        return (salario+regalia+aumento+aumento2+bonoExtra);
    }

    /**
     * metodo toString.
     * devuelve una frase con los objetos de los atributos de la clase
     * @return atributos de la Persona 
     */
    @Override
    public String toString() {
        String discografia=" ";
        for (int i = 0; i < cont; i++) {
            discografia+=this.discografia[i]+"\n";
            
        }
        return super.toString()+"\nCantante{" + "nombreArtistico=" + nombreArtistico + ", generoMusical=" + generoMusical + ", numeroDeSencillos=" + numeroDeSencillos + ", numeroDeConsiertos=" + numeroDeConsiertos + ", numeroDeGiras=" + numeroDeGiras + '}'+"\n Disco:"+discografia;
    }
    
    
    
    
    
}
