/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observable;

/**
 *
 * ES LA CLASE QUE EXTIENDE DE COMPONENTE, AGREGARA TODOS LOS DETALLES
 * COMO LOS SETTERS Y GETTERS DEL ELEMENTO A OBSERVAR "EL OBSERVADO"
 */
public class Observado extends Componente {
    
    //VAMOS A OBSERVAR EL VALOR DE UN FIELD INTEGER
    public int numero;
    
    public void setNumero(int numero){
        this.numero = numero;
        //AQUI COMO SE CAMBIA EL VALOR, ES NECESARIO AGREGAR EL METODO DEL OBSERVADOR
        notificador();
    }
    
    public int getNumero(){
       // System.out.println(numero);
        return this.numero;
    }
    //CONSTRUCTOR X DEFAULT VACIO
    public Observado(){}
    
   
    
    
    
}
