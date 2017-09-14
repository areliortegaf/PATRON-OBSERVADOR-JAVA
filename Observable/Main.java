/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observable;

/**
 *
 * @author asortega
 */
public class Main {
    //PROBAR en la url del mapa
    public static void main(String[] args) {
        Observado ob = new Observado();//se debe de crear el onservado que es el objeto
        Observador os = new Observador(ob);//y el observador
        ob.setNumero(10); //desde aqui se imprime el resultado
        ob.setNumero(20);
        
        //ob.getNumero();
    }
}
