/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

/**
 *
 * @author HP
 */
public class TestMulti5 {//no se necesita implementar
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                show();
            }
        };
        
        
        Runnable r2 = new Runnable() {
            public void run() {
                show2();
            }
        };
        
        
        Runnable r3 = new Runnable() {
            public void run() {
                show3();
            }
        };  
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
    }
    
    public static void show () //en un metodo estatico solo puden referenciar a clase estatico
    {
        System.out.println("Tarea uno");
    }
    public static void show2 () 
    {
        System.out.println("Tarea dos");
    }
    public static void show3 () 
    {
        System.out.println("Tarea tres");
    }
}
