/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class ListaVehiculos {

     //ArrayList    
    private ArrayList <Vehiculo> listaVehiculos;
    private int actual = -1;
    
    //Constructores
    public ListaVehiculos() {
        listaVehiculos = new ArrayList<Vehiculo>();
    }

    public ListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    //Métodos
    public boolean vacio(){
     return getListaVehiculos().isEmpty();
    
    }
    
    public int elementos(){
     return getListaVehiculos().size();
    
    }
    
    public void limpiar() {
        getListaVehiculos().clear();
    }
    
    public void insertar (Vehiculo vehiculo){
        getListaVehiculos().add(vehiculo);
        setActual(this.elementos()-1);
    }
    
    public void borrar (Vehiculo vehiculo){
        if (getListaVehiculos().remove(vehiculo)){
            if (actual == this.elementos()){
                setActual(getActual()-1);
            }     
        }
        
    }
    public void borrarPos (int  x){
        if (getListaVehiculos().remove(x)!=null){
            if (actual == this.elementos()){
                setActual(getActual()-1);
            }     
        }

    }
    
    public boolean busca (Vehiculo vehiculo){
        boolean ok = false;
        int i = 0;
        
        while (ok==false && i<getListaVehiculos().size()) {
            if(getListaVehiculos().get(i).equals(vehiculo)) {
                ok = true;
            }       
            i++;
        }          
        return ok;
    }
    
    public Vehiculo devVehiculo (String numMat) {
        Vehiculo vehiculo = null;
        Vehiculo alma;
        boolean ok = false;
        int i = 0;
        
        while (ok==false && i<getListaVehiculos().size()) {
            vehiculo = (Vehiculo) this.getListaVehiculos().get(i);
            if (vehiculo.getMatricula().equalsIgnoreCase(numMat)) {
                ok = true;
            }
            i++;
        }
        if(ok==false){
            vehiculo=null;
        }
        return vehiculo;
    }
    
    public int devVehiculoPos (String numMat) {
        Vehiculo vehiculo = null;
        boolean ok = false;
        int i = 0;
        
        while (ok==false && i<getListaVehiculos().size()) {
            vehiculo = (Vehiculo) this.getListaVehiculos().get(i);
            if (vehiculo.getMatricula().equalsIgnoreCase(numMat)) {
                ok = true;
            }
            else
              i++;
        }
        if (!ok)
              i=-1;
        return i;
    }  
  
    //GET Y SET
    public ArrayList <Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList <Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    public Vehiculo dameActual(){
        Vehiculo v;
        return (listaVehiculos.get(actual));
    }
    
    public Vehiculo damePrimero(){
        Vehiculo v=null;
        if (this.elementos()>0){
            v = listaVehiculos.get(0);
            actual = 0;
        }
        return (v);
    }
    public Vehiculo dameUltimo(){
        Vehiculo v=null;
        if (this.elementos()>0){
            v = listaVehiculos.get(this.elementos()-1);
            actual=this.elementos()-1;
        }
        return (v);
    }
    public Vehiculo dameSiguiente(){
        Vehiculo v=null;
        if (actual < this.elementos()-1){
            actual=getActual()+1;
            v = listaVehiculos.get(actual);         
        }
        return (v);
    }
    public Vehiculo dameAnterior(){
        Vehiculo v=null;
        if (actual > 0){
            actual=getActual()-1;
            v = listaVehiculos.get(actual);         
        }
        return (v);
    }
}
