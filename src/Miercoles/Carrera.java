/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;

/**
 *
 * @author HP
 */
public class Carrera {
    public static void main(String[] args) {
        Tortuga t1 = new Tortuga();
        Thread t2 = new Thread(new Liebre());//son maneras de construir
        /*Liebre t3 = new Liebre();
        Thread hilo = new Thread(t3);*/
        
        t1.start();
        t2.start();
    }
}
