/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

/*
Cómo realizar una tarea por multiples hilos
 */
public class TestMulti extends Thread{
    public void run()
    {
        System.out.println("Tarea 1");
    }
    
    public static void main(String[] args) {
        TestMulti t1 = new TestMulti(), t2= new TestMulti(), t3 = new TestMulti();
        t1.start();
        t2.start();
        t3.start();
    }
    
}
