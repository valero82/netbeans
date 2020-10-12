package com.iescamp.ejemplo_fabrica_donuts;

/**
 *
 * @author Profesor
 ContadorDonuts es una clase estática que no necesita instanciarse para ser utilizada
 */

public final class ContadorDonuts {
    private static int cuenta=0;
    
    public static synchronized void incrementa(){
        cuenta++;
    }
    
    public static synchronized void decrementa(){
        cuenta--;
    }
    
    public static int obtenerCuenta(){
        return cuenta;
    }
}
