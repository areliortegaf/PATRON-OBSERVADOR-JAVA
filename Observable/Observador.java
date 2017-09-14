/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observable;

/**
 *
 * LA CLASE QUE SE ENCARGA DE OBSERVAR IMPLEMENTA LA INTERFACE IOBSERVADOR
 */
public class Observador implements IObservador {
    
    //SE DECLARA UN field DEL TIPO DE LA CLASSE "OBSERVADO"
    private Observado observado;
    
    public Observador (Observado obs){
        observado = obs;
        observado.agregarObservador(this);
    }
    
    //SE AGREGA LA FUNCIONALIDAD AL METODO
    @Override
    public void elementoActualizado() {
        System.out.println("El valor del numero es " + this.observado.getNumero());
    }
    
}
