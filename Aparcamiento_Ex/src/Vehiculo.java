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
abstract public class Vehiculo {
    // algún atributo de clase
    private static int numVeh=0;
    
    // atributos
    protected String matricula;//Modelo europeo
    protected Calendar horaEntrada;
    
    // constructores 
    
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        setNumVeh(getNumVeh()+1);
        comienzaEstancia();
    }    
   
     // los get y sets
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
    
    public static int getNumVeh() {
        return numVeh;
    }

    public static void setNumVeh(int numVeh) {
        Vehiculo.numVeh = numVeh;
    }
    
    // metodos
     public void comienzaEstancia() {
          this.horaEntrada=Calendar.getInstance();
    }
   
     // métodos abstractos
    abstract public void finEstancia();
    
}
