/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles.Nivel2;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Cliente paco = new Cliente("Francisco",new int[]{1,2,3,4});
        Cliente Sergio = new Cliente("Sergio",new int[]{1,1,1,1});
        
        Cajera claudia = new Cajera("Claudia",paco);
        Cajera david = new Cajera("David",Sergio);
        //Tiempo inicial de referencia
        
        
        claudia.start();
        david.start();
    }
}
