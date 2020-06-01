/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *Disco.
 * clase con dependencia de composicion de la clase Cantante por lo que sus objetos
 * se crean en la clase Cantante, contine sus geter y seter de todos sus atrubutos
 * @author ROMEL
 */
public class Disco {
    private int codigo;
    private String nombre;
    private int añoDeLanzamiento;
    

    /**
     * constructor clase Disco.
     * inicializa o da valores a los atributos que resive por parametro de entrada
     * @param codigo -tipo int
     * @param nombre -tipo String
     * @param añoDeLanzamiento -Tipo int
     */
    public Disco(int codigo, String nombre, int añoDeLanzamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.añoDeLanzamiento = añoDeLanzamiento;
    }
    
    /**
     * Constructor Disco.
     * este contructor se encuentra vacio para ser llamado desde la clase Cantante
     * y dar valores a sus atributos
     */
    public Disco(){}

    /**
     * getCodigo.
     * devuelve el valor o dato del atributo codigo
     * @return cofigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * setCodigo.
     * asigna valores o datos al atributo codigo
     * @param codigo tipo int
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * getNombre.
     * devuelve el valor o dato del atributo nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setNombre.
     * asigna valores o datos al atributo nombre
     * @param nombre tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getAñoDeLanzamiento.
     * devuelve el valor o dato del atributo añoDeLanzamiento
     * @return añoDeLanzamiento
     */
    public int getAñoDeLanzamiento() {
        return añoDeLanzamiento;
    }

    /**
     * setAñoDeLanzamiento.
     * asigna valores o datos al atributo añoDeLanzamiento
     * @param añoDeLanzamiento tipo int
     */
    public void setAñoDeLanzamiento(int añoDeLanzamiento) {
        this.añoDeLanzamiento = añoDeLanzamiento;
    }

    //hashCode del atributo codigo
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.codigo;
        return hash;
    }

    //metodo equals del atributo codigo
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
        final Disco other = (Disco) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    

    /**
    * metodo toString.
    * devuelve una frase con los objetos de los atributos de la clase
    * @return atributos de la Persona 
    */
    @Override
    public String toString() {
        return "Disco{" + "codigo=" + codigo + ", nombre=" + nombre + ", a\u00f1oDeLanzamiento=" + añoDeLanzamiento + '}';
    }
    
    
}
