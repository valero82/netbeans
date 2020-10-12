package com.iescamp.repartidor_de_palabras;

/**
 *
 * @author Profesor
 */
public class Main {
    public static void main(String[] args){
        ContenedorPalabras.anadirPalabra("perro");
        ContenedorPalabras.anadirPalabra("gato");
        
        System.out.println("palabra: " + ContenedorPalabras.leerPalabra());
        System.out.println("palabra: " + ContenedorPalabras.leerPalabra());
        System.out.println("palabra: " + ContenedorPalabras.leerPalabra());
        System.out.println("Contador: " + ContenedorPalabras.obtenerCantidadPalabrasDisponibles());
        
    }
}
