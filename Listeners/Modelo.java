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
public class Modelo extends Componente {
    
    public String valorString = "";
    public int valorInt = 0;
    
    public Modelo(String valorString, int valorInt){
        this.valorInt = valorInt;
        this.valorString = valorString;
    }
    
    public String obtenerValorString(){
        return this.valorString;
    }
    
    public int obtenerValorInt(){
        return this.valorInt;
    }
    public void cambiarValorString(String valorString){
        this.valorString = valorString;
        notificador();
    }
    
    public void cambiarValorInt(int valorInt){
        this.valorInt = valorInt;
        notificador();
    }
    
    public Modelo(){}
}
