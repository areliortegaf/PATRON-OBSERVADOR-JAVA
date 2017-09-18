/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

/**
 *
 * @author asortega
 */
public class ClaseObservadora implements Observador {
    
    public Modelo modelo;
    
    public ClaseObservadora(Modelo modelo){
        this.modelo = modelo;
        modelo.agregarObservador(this);
        
    }

    @Override
    public void changeListener() {
        System.out.println("Desde la clase observadora traigo el nombre: " + modelo.obtenerValorString() + " y el valor: " + modelo.obtenerValorInt());
    }
    
    //PRUEBA DEL PROGRAMA
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        ClaseObservadora co = new ClaseObservadora(modelo);
        modelo.cambiarValorString("Areli");
        modelo.cambiarValorInt(1000);
        
    }
    
}
