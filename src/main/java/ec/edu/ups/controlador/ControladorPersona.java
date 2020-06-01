/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cancion;
import ec.edu.ups.modelo.Cantante;
import ec.edu.ups.modelo.Compositor;
import ec.edu.ups.modelo.Disco;
import ec.edu.ups.modelo.Persona;

/**
 * Controlador Persona.
 * Este clase me permite guardar la informacion de una persona de manera temporal
 * a traves de  un arreglo de tipo Persona[], teniedo un maximo de 10 objetos en el arreglo.
 * la classe implementa una interface para el CRUD del modelo tipo Persona
 * @author ROMEL
 * @see IControlador
 */
public class ControladorPersona implements IControlador  {
    private Persona[] personas;
    private int cont;
    /**
     *constructor de la clase.
     * este metodo inicializa o da valores a nuestro atributo persona  
     */
    public ControladorPersona(){
        personas= new Persona[MAX_OBJECTS];
        cont=0;
    }
    
    /**
     * Metodo Creat.
     * este metodo  nos sirve para crear o guarda los objetos de tipo persona 
     * en nuestro arreglo 
     * @param obj- debe ser tipo persona   
     */
    @Override
    public void creat(Persona obj) {
       if(cont<=MAX_OBJECTS)
        {
            //casting de objeto a persona 
            personas[cont]=(Persona)obj;
            cont++;
        }
        else{System.out.println("Has llegado al limite de Personas");}
    }
    /**
     * Metodo Read.
     * busca y obtine datos del arreglo Persona[]
     * implementado para buscar por medio del codigo dichos objetos ya creados 
     * en el arreglo. 
     * @param obj-debe ser del tipo persona 
     * @return persona
     */

    @Override
    public Object read(Object obj) {
        
        for (Persona persona: personas) {
            if(persona!=null && persona.getCodigo().equals(obj))
            {
                return persona;
            } 
        }
        return null;
    }

    /**
     * metodo Update.
     * actualisa los datos de la persona atraves de su valor unico
     * @param obj 
     */
   @Override
    public void update(Persona obj) {
        for (int i = 0; i < MAX_OBJECTS; i++) {
            Persona persona=personas[i];
            if(personas[i].equals(obj))
            {
                personas[i]=(Persona)obj;
                break;
            }
        }
    }
        
    
    /**
     * metodo Delete.
     * elimina los datos de una posicion en el arreglo
     * @param obj -tine que ser del tipo persona  
     */
    @Override
    public void delete(Persona obj) {
        for (int i = 0; i < MAX_OBJECTS; i++) {
            if(personas[i].equals(obj))
            {
                personas[i]=null;
                break;
            }
        }
      
    }
    
    /**
    * Metodo Imprimir.
    * muestra los datos de la persona guardada en el arreglo, 
    * devuelve el resultado del salario total de las personas atraves 
    * del uso del enlace dinamico
    */
    public void imprimir(){
        for (Persona persona : personas) {
            if(persona!=null)
            {
                System.out.println(persona.toString());
                System.out.println("Salario Total:"+persona.calculoDeSalario());
            }
        }
    }
    
    /**
     * Metodo de Busqueda por nombre del disco.
     * identifica si el objeto persona es de tipo o pertenece a la clase Cantante 
     * usando el parametro intanceof, para asi poder localisar al cantante
     * por medio de su disco recorriendo asi la discografia del cantante 
     * hasta encontrar el nombre buscado.
     * @param nombreBuscar-tine que ser del tipo String
     * @return persona.
     * @see Cantante
     */
    public Persona buscarPorNombreDeDisco(String nombreBuscar)
    {
        for (Persona persona : personas) {
            if(persona!=null && persona instanceof Cantante)
            {
                //castig persona a Cantante
                Cantante cant=(Cantante) persona;
                for (Disco disco : cant.getDiscografia()) {
                    if(disco.getNombre().equals(nombreBuscar))
                    {
                        return persona;
                    }
                }
            }
            
        }
        return null;
    }
    
   /**
    * Metodo de Busqueda por titulo de la cancion .
    * identifica si el objeto persona es de tipo o pertenece a la clase Compositor 
    * usando el parametro intanceof, para asi poder localisar al compositor
    * por medio del titulo de su cancion recorriendo asi el arreglo CancionesTop100Billboard 
    * hasta encontrar el titulo buscado.
    * @param nombreBuscarc- tiene que ser del tipo String
    * @return 
    * @see Compositor
    */
    public Persona buscarPorTituloDeCancion(String nombreBuscarc)
    {
        for (Persona persona : personas) {
            if(persona!=null && persona instanceof Compositor)
            {
                //Casting de persona a compositor
                Compositor compo=(Compositor) persona;
                for (Cancion cancion : compo.getCancionesTop100Billboard()) {
                    if(cancion.getTitulo().equals(nombreBuscarc))
                    {
                        return persona;
                    }
                }
            }
            
        }
        return null;
    }
}
