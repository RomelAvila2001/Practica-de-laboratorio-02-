/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *Cancion.
 * clase con dependencia de composicion de la clase Compositor por lo que sus objetos
 * se crean en la clase compositor contine sus geter y seter de todos sus atrubutos
 * @author ROMEL
 */
public class Cancion {
    private int codigo;
    private String titulo;
    private String letra;
    private double tiempoEnMinutos;
    
    /**
     * constructor clase Cancion.
     * inicializa o da valores a los atributos que resive por parametro de entrada
     * @param codigo -tipo int
     * @param titulo -tipo String
     * @param letra -tipo string
     * @param tiempoEnMinutos  -Tipo double
     */
    public Cancion(int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.letra = letra;
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    /**
     * Constructor Cancion.
     * este contructor se encuentra vacio para ser llamado desde la clase compositor 
     * y dar valores a sus atributos
     */
    public Cancion(){}
    

    /**
     * getCodigo.
     * devuelve el valor o dato del atributo codigo
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }
    

    /**
     * setCodigo.
     * asigna valores o datos al atributo codigo
     * @param codigo -tipoint
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * getTitulo.
     * devuelve el valor o dato del atributo titulo
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * setTitulo.
     * asigna valores o datos al atributo titulo
     * @param titulo tipo String
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * getLetra.
     * devuelve el valor o dato del atributo letra
     * @return letra
     */
    public String getLetra() {
        return letra;
    }

    /**
     * setLetra
     * asigna valores o datos al atributo letra
     * @param letra tipo String
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }

    /**
     *getTiempoEnMinutos.
     * devuelve el valor o dato del atributo tiempoEnMinutos 
     * @return tiempoEnMinutos
     */
    public double getTiempoEnMinutos() {
        return tiempoEnMinutos;
    }

    /**
     * setTiempoEnMinutos.
     * asigna valores o datos al atributo tiempoEnMinutos 
     * @param tiempoEnMinutos tipo double
     */
    public void setTiempoEnMinutos(double tiempoEnMinutos) {
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    //hastCode del atributo codigo
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigo;
        return hash;
    }

    //equals del atributo codigo 
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
        final Cancion other = (Cancion) obj;
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
        return "Cancion{" + "codigo=" + codigo + ", titulo=" + titulo + ", letra=" + letra + ", tiempoEnMinutos=" + tiempoEnMinutos + '}';
    } 
}
