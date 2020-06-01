/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *Persona.
 * Es una clase padre divido a que pose los atributos en comun con sus respectivas
 * clase hijas que son Cantante y Compositor, a su ves es una clase abtracta 
 * devido a que pose el metodo calculo de salario el cual esta solo implementado
 * y es abstracto
 * @author ROMEL
 */
public abstract class Persona {
    //creacion de los atributos
    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalida;
    double salario;
    /**
     * contructor de la clase persona.
     * este contructor se encuentra vacio para ser llamado desde la clase principal 
     * y dar valores a sus atributos
     */
    public Persona(){}

    /**
     * Constructor de la clase Persona.
     * inicializa o da valores a los atributos que resive por parametro de entrada
     * @param codigo
     * @param nombre
     * @param apellido
     * @param edad
     * @param nacionalida
     * @param salario 
     */
    public Persona(String codigo, String nombre, String apellido, int edad, String nacionalida, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalida = nacionalida;
        this.salario = salario;
    }
    
    /**
     * Metodo get Codigo.
     * devuelve el valor o dato del atributo Codigo
     * @return codigo
     */
    public String getCodigo() {
        return codigo;
    }
    
    /**
     * Set Codigo
     * asigna valores o datos al atributo codigo
     * @param codigo- tipo String 
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * get Nombre.
     * devuelve el valor o dato del atributo nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * set Nombre.
     * asigna valores o datos al atributo nombre
     * @param nombre -tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * get Apellido.
     * devuelve el valor o dato del atributo apellido
     * @return Apellido 
     */
    public String getApellido() {
        return apellido;
    }
    
    /**
     * set Apellido.
     * asigna valores o datos al atributo apellido
     * @param apellido-tipo String 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * get Edad.
     * devuelve el valor o dato del atributo edad
     * @return Edad
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * set Edad.
     * asigna valores o datos al atributo edad
     * @param edad- tipo int 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    /**
     * get Nacionalidad.
     * devuelve el valor o dato del atributo nacionalidad
     * @return Nacionalidad 
     */
    public String getNacionalida() {
        return nacionalida;
    }
    
    /**
     * set Nacionalidad.
     * asigna valores o datos al atributo nacionalidad
     * @param nacionalida- tipo String
     */
    public void setNacionalida(String nacionalida) {
        this.nacionalida = nacionalida;
    }
    
    /**
     * get Salario.
     * devuelve el valor o dato del atributo salario
     * @return salario
     */
    public double getSalario() {
        return salario;
    }
    
    /**
     * set salario.
     * asigna valores o datos al atributo salario
     * @param salario 
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //implementacion hasCode atributo codigo
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    //implementacion metod equals atributo codigo
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    //declaracion del metodo calcular salario
    public abstract double calculoDeSalario();

    
    /**
     * metodo toString.
     * devuelve una frase con los objetos de los atributos de la clase
     * @return atributos de la Persona 
     */
    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nacionalida=" + nacionalida + ", salario=" + salario + '}';
    }
    
    
}
