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
public class Estancia {
    
    // atributos
    private String matricula; 
    private Calendar horaEntrada;
    private Calendar horaSalida;
    
    // constructor
    public Estancia(String matricula, Calendar horaEntrada) {
        this.matricula = matricula;
        this.horaEntrada = horaEntrada;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Calendar getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Calendar horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Calendar getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Calendar horaSalida) {
        this.horaSalida = horaSalida;
    }

    public static long difEnMinutos(Calendar fechaInicial ,Calendar fechaFinal){
        long totalMinutos=0;
        totalMinutos=((fechaFinal.getTimeInMillis()-fechaInicial.getTimeInMillis())/60000);
        System.out.println(totalMinutos);
        return totalMinutos;
    }
}