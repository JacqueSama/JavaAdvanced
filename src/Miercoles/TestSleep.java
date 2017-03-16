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
public class TestSleep extends Thread {
    public void run()
    {
        for (int i = 1; i<5; i++)
        {
            try{
                Thread.sleep(500);
                System.out.println(i);// se imprime el contador
                Thread.interrupted();
            }catch (InterruptedException ie){
                System.out.println(ie); // en caso de que se interrumpa se cacha la excepcion
            }
        }
    }
    public static void main(String[] args) {
        TestSleep t1 = new TestSleep(); // se declara
        TestSleep t2 = new TestSleep();
        
        t1.start(); // se inicia
        t2.start();
    }
}
