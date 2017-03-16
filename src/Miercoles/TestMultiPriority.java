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
public class TestMultiPriority extends Thread{
    public void run()
    {
        System.out.println("El hilo que está corriendo es: "+Thread.currentThread().getName());
        System.out.println("La prioridad del hilo actual es: "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        TestMultiPriority p1 = new TestMultiPriority(), p2 = new TestMultiPriority();
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);
        
        p1.start();
        p2.start();
    }
}
