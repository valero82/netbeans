package com.iescamp.ejemplo_fabrica_donuts;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Profesor
 */
public class GeneradorDonuts extends Thread{
    
    public void generar(){
        ContadorDonuts.incrementa();
    }
    
    @Override
    public void run(){
        for(int i=1; i<=200; i++){
            this.generar();
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(GeneradorDonuts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
