/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;


public class TestJoinNombre extends Thread{
    public void run()
    {
        System.out.println("corriendo");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        TestJoinNombre t1 = new TestJoinNombre(), t2 = new TestJoinNombre(), t3 = new TestJoinNombre();
        
        System.out.println("El nombre del hilo 1 es: "+t1.getName());
        System.out.println("El nombre del hilo 2 es: "+t2.getName());
        System.out.println("El nombre del hilo 3 es: "+t3.getName());
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.setName("Hola soy un hilo feliz :P");
        t2.setName("Yo también soy un hilo periente");
        t3.setName("bebetzita emotza");
        
        System.out.println("El hilo 1 es ahora: "+t1.getName());
        System.out.println("El hilo 2 es ahora: "+t2.getName());
        System.out.println("El hilo 3 es ahora: "+t3.getName());
    }
}
