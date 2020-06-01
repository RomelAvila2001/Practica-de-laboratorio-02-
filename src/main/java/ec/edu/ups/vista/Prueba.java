/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.modelo.Cantante;
import ec.edu.ups.modelo.Compositor;
import ec.edu.ups.modelo.Persona;
import java.util.Scanner;

/**
 *Principal.
 * en esta clase se ejecuta el programa todos los datos se ingresan por teclado
 * existe un switch con el que se seleccionan las acciones desiadas 
 * @author ROMEL
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ControladorPersona controladorPersona = new ControladorPersona();

        boolean Salir = false;
//se crea un bucle while para repetir el programa hasta dar al orden de saliada
        while (Salir == false) {
            System.out.println("Menu de Seleccion");
            System.out.println("1. Ingreso de Cantante");
            System.out.println("2. Ingreso de Compositor");
            System.out.println("3. Agregar Clientes");
            System.out.println("4. Imprimir Persona");
            System.out.println("5. Busqueda de Cantante por nombre de Disco");
            System.out.println("6. Busqueda de Compositor por nombre de Cancion");
            System.out.println("7. Salir");

            int respuesta = teclado.nextInt();
//instancia de seitch con 7 opciones de seleccion
            switch (respuesta) {
              //se crea el cantante se le pasan los objetos por medio del metodo seter
                case 1:
                    System.out.println("Nombre del Cantante");
                    String nombre = teclado.next();
                    System.out.println("Apellido del Cantante");
                    String apellido = teclado.next();
                    System.out.println("Nacionalidad");
                    String nacionalida = teclado.next();
                    System.out.println("Nombre Artistico");
                    String nombreArtistico = teclado.next();
                    System.out.println("Genero Musical");
                    String generoMusical = teclado.next();
                    System.out.println("codigo cantante");
                    String codigo = teclado.next();
                    System.out.println("edad");
                    int edad = teclado.nextInt();
                    System.out.println("Sencillos");
                    int sencillos = teclado.nextInt();
                    System.out.println("giras");
                    int giras = teclado.nextInt();
                    System.out.println("consiertos");
                    int consiertos = teclado.nextInt();
                    System.out.println("Salario");
                    double salario = teclado.nextDouble();
                    System.out.println("nombre del Disco");
                    String nombred = teclado.next();
                    System.out.println("codigo del disco");
                    int codigod = teclado.nextInt();
                    System.out.println("Año de Lansamiento");
                    int añod = teclado.nextInt();

                    Cantante c = new Cantante();

                    c.setNombre(nombre);
                    c.setApellido(apellido);
                    c.setNacionalida(nacionalida);
                    c.setNombreArtistico(nombreArtistico);
                    c.setGeneroMusical(generoMusical);
                    c.setCodigo(codigo);
                    c.setEdad(edad);
                    c.setNumeroDeSencillos(sencillos);
                    c.setNumeroDeGiras(giras);
                    c.setNumeroDeConsiertos(consiertos);
                    c.setSalario(salario);
                    c.agregarDisco(codigod, nombred, añod);

                    controladorPersona.creat(c);

                    break;
                case 2:
                    //se crea el composito se le pasan los objetos por medio del metodo seter
                    System.out.println("Nombre del Compositor");
                    String nombrecom = teclado.next();
                    System.out.println("Apellido del Compositor");
                    String apellidocom = teclado.next();
                    System.out.println("Nacionalidad");
                    String nacionalidacom = teclado.next();
                    System.out.println("codigo compositor");
                    String codigocom = teclado.next();
                    System.out.println("edad");
                    int edadcom = teclado.nextInt();
                    System.out.println("Salario");
                    double salariocom = teclado.nextDouble();
                    System.out.println("Numero de Composiciones");
                    int numeroComposiciones = teclado.nextInt();
                    System.out.println("nombre cancion");
                    String nombrecan = teclado.next();
                    System.out.println("letra");
                    String letra = teclado.next();
                    System.out.println("codigo camcion");
                    int codigocan = teclado.nextInt();
                    System.out.println("tiempo duracion");
                    double tiempoMinutos = teclado.nextDouble();
                    System.out.println("nombre cancion");
                    String nombrecan2 = teclado.next();
                    System.out.println("letra");
                    String letra2 = teclado.next();
                    System.out.println("codigo camcion");
                    int codigocan2 = teclado.nextInt();
                    System.out.println("tiempo duracion");
                    double tiempoMinutos2 = teclado.nextDouble();

                    Compositor com = new Compositor();
                    com.setNombre(nombrecom);
                    com.setApellido(apellidocom);
                    com.setNacionalida(nacionalidacom);
                    com.setCodigo(codigocom);
                    com.setEdad(edadcom);
                    com.setSalario(salariocom);
                    com.setNumeroDeComposiciones(numeroComposiciones);
                    com.agregarCancion(codigocan, letra, nombrecan, tiempoMinutos);
                    com.agregarCancion(codigocan2, nombrecan2, letra2, tiempoMinutos2);

                    controladorPersona.creat(com);

                    break;
                case 3:
                    boolean sair = false;
//se crea un while para la ejecucion constante del caso 3 hasta dar la salida
                    while (sair == false) {
                        System.out.println("1 añadir cliente");
                        System.out.println("2 salir");

                        int respuesta2 = teclado.nextInt();
//se crea un switch para elejir las opciones del menu
                        switch (respuesta2) {
                            case 1:
                                String codigoDelCompositor;
                                String codigoDelCantante;
                                System.out.println("agregar cleinte");
                                System.out.println("ingrese el codigo del compositor");
                                codigoDelCompositor = teclado.next();
                                
//sellama al metodo controladorPersona.read para pasar el parametro a buscar
                                Persona personaCas = (Persona) controladorPersona.read(codigoDelCompositor);
// nos devuelve una persona si entra al condicional
                                if (personaCas != null) {
                                    Compositor Com = (Compositor) personaCas;
                                    System.out.println("compositor:" + "\nNombre" + Com.getNombre() + "\nApellido:" + Com.getApellido());

                                    System.out.println("ingres el codigo del cantante a ingresar");
                                    codigoDelCantante = teclado.next();
                                    
//sellama al metodo read del controladorPersona para pasar el parametro a buscar
                                    Persona personaen = (Persona) controladorPersona.read(codigoDelCantante);
                                    
                                    if (personaen != null) {
                                        //se agrega el cantante encontrado al arreglo cleinte
                                        Cantante Can = (Cantante) personaen;
                                        Com.agregarCliente(Can);

                                        System.out.println("cliente agregado" + personaen.toString());
                                    } else {
                                        System.out.println("persona no encontrada");
                                    }
                                }

                                
                                break;
                            case 2:
                                sair=true;
                                break;
                        }
                    }

                    break;
                case 4:
                    //se llama al metodo imprimir del controlador para hacer la impresion de las personas
                    controladorPersona.imprimir();
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del disco");
                    String nombreBuscar = teclado.next();
                    //castiamos cantante para pasarle el parametro con el que deciamos buscar 
                    Cantante can = (Cantante) controladorPersona.buscarPorNombreDeDisco(nombreBuscar);
                    if (can != null) {
                        System.out.println("Nombre:" + "" + can.getNombre());
                        System.out.println("Apellido:" + "" + can.getApellido());
                    } else {
                        System.out.println("No existe ese disco");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el nombre de la Cancion");
                    String nombreBuscarc = teclado.next();
                    //castiamos cantante para pasarle el parametro con el que deciamos buscar 
                    Compositor compo = (Compositor) controladorPersona.buscarPorTituloDeCancion(nombreBuscarc);
                    if (compo != null) {
                        System.out.println("Nombre Compositor:" + "" + compo.getNombre());
                        System.out.println("Apellido Compositor:" + "" + compo.getApellido());
                    } else {
                        System.out.println("No existe esa cancion");
                    }
                    break;
                case 7:
                    //damos fin al bucle dandole valos a la variable salir
                    Salir = true;
                    break;
            }
        }

    }
}
