/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Alumno
 */
public class ListaEstancias {
     //ArrayList    
    private ArrayList <Estancia> listaEstancias;
    private int actual = 0;
    
    //Constructores
    public ListaEstancias() {
        listaEstancias = new ArrayList<Estancia>();
    }

    public ListaEstancias(ArrayList<Estancia> listaEstancias) {
        this.listaEstancias = listaEstancias;
    }
    //Métodos
    public boolean vacio(){
     return getListaEstancias().isEmpty();
    
    }
    
    public int elementos(){
     return getListaEstancias().size();
    
    }
    
    public void limpiar() {
        getListaEstancias().clear();
    }
    
    public void insertar (Estancia estancia){
        getListaEstancias().add(estancia);
    }
    
    public void borrar (Estancia estancia){
        getListaEstancias().remove(estancia);
    }
    public void borrarPos (int  x){
        getListaEstancias().remove(x);
    }
    
    public boolean busca (Estancia estancia){
        boolean ok = false;
        int i = 0;
        
        while (ok==false && i<getListaEstancias().size()) {
            if(getListaEstancias().get(i).equals(estancia)) {
                ok = true;
            }       
            i++;
        }          
        return ok;
    }
    
    public Estancia devEstancia (String numMat) {
        Estancia estancia = null;
        boolean ok = false;
        int i = 0;
        
        while (ok==false && i<getListaEstancias().size()) {
            estancia = (Estancia) this.getListaEstancias().get(i);
            if (estancia.getMatricula().equalsIgnoreCase(numMat)) {
                ok = true;
            }
            i++;
        }
        if(ok==false){
            estancia=null;
        }
        return estancia;
    }
    
    public int devEstanciaPos (String numMat) {
        Estancia estancia;
        boolean ok = false;
        int i = 0;
        
        while (ok==false && i<getListaEstancias().size()) {
            estancia = (Estancia) this.getListaEstancias().get(i);
            if (estancia.getMatricula().equalsIgnoreCase(numMat)) {
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
    public ArrayList <Estancia> getListaEstancias() {
        return listaEstancias;
    }

    public void setListaEstancias(ArrayList <Estancia> listaEstancias) {
        this.listaEstancias = listaEstancias;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

}
