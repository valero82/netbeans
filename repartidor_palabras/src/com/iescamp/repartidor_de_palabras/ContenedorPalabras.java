package com.iescamp.repartidor_de_palabras;

import java.util.LinkedList;

/**
 *
 * @author Profesor
 */
public final class ContenedorPalabras{
    private static LinkedList<String> contenedor = new LinkedList<String>();
    
    public static synchronized void anadirPalabra(String unaPalabra){
        contenedor.add(unaPalabra);
    }
    
    public static synchronized String leerPalabra(){
       if(contenedor.isEmpty()){
           return null;
       }
       return contenedor.remove();
    }
    
    public static int obtenerCantidadPalabrasDisponibles(){
        return contenedor.size();
    }
}
