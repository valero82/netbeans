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
public class Moto extends Vehiculo{
    
   private static final double precioMinuto = 0.001;

    public static double getPrecioMinuto() {
        return precioMinuto;
    }

    // atributos
    private String marca;
    private String modelo;
    private String tipo;
    private String color;
    private int numPuertas;
    
    //tiempo de estancia acumulado en el mes en curso
    private int tiempoAcumulado = 0;
    

    // constructores
   

    public Moto(String matricula) {
        super(matricula);
    }
//Residente(marca, modelo, tipo, color, numPuertas, matricula, tiempoAcumulado)
    public Moto(String marca, String modelo, String tipo, String color, int numPuertas, String matricula, int tiempoAcumulado) {
        super(matricula);
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.numPuertas = numPuertas;
        this.tiempoAcumulado = tiempoAcumulado;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
        
    public String getMarca() {
        return marca;
    }
   

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void finEstancia() {
        // incrementa el tiempo acumulado en la duración de
        // la estancia que finaliza en este instante
        // faltaría definir un método llamado difEnMinutos
        tiempoAcumulado +=Estancia.difEnMinutos(getHoraEntrada(),Calendar.getInstance());
    }

    public void comienzaMes() {
        // pone a 0 el tiempo acumulado
        tiempoAcumulado=0;
    }

    public double pagoMes() {
        return tiempoAcumulado*precioMinuto;
    }
}
