package com.iescamp.ejemplo_fabrica_donuts;

/**
 *
 * @author Profesor
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException{
        GeneradorDonuts gd1 = new GeneradorDonuts();
        GeneradorDonuts gd2 = new GeneradorDonuts();
        GeneradorDonuts gd3 = new GeneradorDonuts();
        ComedorDonuts cd1 = new ComedorDonuts();
        ComedorDonuts cd2 = new ComedorDonuts();
        ComedorDonuts cd3 = new ComedorDonuts();
        
        gd1.start();
        gd2.start();
        gd3.start();
        cd1.start();
        cd2.start();
        cd3.start();
        
        /**Hago que la execución de Principal no termine hasta que
         * que los tres hilos hayan terminado
         */
        gd1.join();
        gd2.join();
        gd3.join();
        cd1.join();
        cd2.join();
        cd3.join();
        System.out.println("Donuts generados: " + ContadorDonuts.obtenerCuenta());
    }
    
}
