/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;

/*

 */
public class TestJoin extends Thread{
    public void run ()
    {
        for (int i =1; i<= 10; i++)
        {
            try{
                Thread.sleep(500);
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        TestJoin t1 = new TestJoin(), t2 = new TestJoin(), t3 = new TestJoin();
        t1.setName("Hilo 1");
        t2.setName("Hilo 2");
        t3.setName("Hilo 3");
        t1.start();
        try{
            t1.join(1500); //se mete
        }catch (InterruptedException ie){
            System.out.println(ie);
        }
        t2.start();
        t3.start();
    }
}
