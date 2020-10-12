package com.iescamp.ejemplo_fabrica_donuts;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Profesor
 */
public class ComedorDonuts extends Thread{
    
    /**
     * Cada llamada a comer, hace que el comedor de donuts se coma 10 donuts
     */
    public void comer(){
        ContadorDonuts.decrementa();
    }
    
    public void run(){
        for(int i=1; i<=10; i++){
            comer();
            try {
                sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(ComedorDonuts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
