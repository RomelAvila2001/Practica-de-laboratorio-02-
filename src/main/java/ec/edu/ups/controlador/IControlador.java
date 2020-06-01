/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;

/**
 *IControlador.
 * crea o define los metodos del CRUD con los que luego se podra interactuar 
 * @author ROMEL
 */
public interface IControlador {
    public static final int MAX_OBJECTS=10;
    //instancia de los metodos
    public void creat(Persona obj);
    public Object read(Object obj);
    public void update(Persona obj);
    public void delete(Persona obj);
    
    
}
