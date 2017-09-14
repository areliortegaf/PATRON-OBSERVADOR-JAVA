/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * La clase componente debe de ser una clase abstracta
 */
public abstract class Componente {
    //CREAMOS EL ARRAY QUE GUARDARA CADA OBSERVADOR
    
    List<IObservador> lista = new ArrayList<IObservador>();
    //CREAMOS METODOS ADD, REMOVE Y EL METODO QUE NOTIFICA
    
    public void agregarObservador(IObservador o){
        lista.add(o);
    }
    
    public void eliminarObservador(IObservador o){
        lista.remove(o);
    }
    //EL NOTIFICADOR DEBE DE CONTENER UN ITERADOR O FOREACH, QUE LLAME EL METODO
    //DE LA INTERFACE 
    public void notificador(){//PASA POR TODOS LOS OBSERVADORES
        for (IObservador io : lista) {
            io.elementoActualizado();//EJECUTA EL METODO DEL OBSERVADOR EN CADA UNO
        }
    }
    
    
}
