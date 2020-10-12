/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
/**
 *
 * @author Alumno
 */
public class NoResidente extends Vehiculo{

    // atributo de clase
    private static final double precioMinuto = 0.02;

    public static double getPrecioMinuto() {
        return precioMinuto;
    }
    
    // atributos miembro
    private double pagoEstancia=0.0;
    
    // constructor
    public NoResidente(String matricula) {
        super(matricula);
    }
    
    

    @Override
    public void finEstancia(){
        // calcula la cantidad a pagar

        // falta el método de calculo de diferencia
        pagoEstancia =Estancia.difEnMinutos(getHoraEntrada(),Calendar.getInstance()) * precioMinuto;
    }
    
    public double pagoEstancia() {
        return pagoEstancia;
    }
}
