/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asortega
 */
public abstract class Componente {
    
   
    List<Observador> listaObservadores = new ArrayList<Observador>(); 
    
    public void agregarObservador(Observador o){
        listaObservadores.add(o);
                
    }
    
    public void eliminarObservador(Observador o){
         listaObservadores.remove(o);
    }
    
    public void notificador(){
        for (Observador lo: listaObservadores){
            lo.changeListener();
        }
    }
    
    
}
