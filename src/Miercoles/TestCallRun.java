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
class TestCall
{
    public void run()
    {
        System.out.println("Running");
    }
}
public class TestCallRun extends Thread{
    public void run()
    {
        for (int i = 1; i <=5; i++)
        {
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
    public static void main(String[] args) {
        TestCallRun t1 = new TestCallRun(), t2 = new TestCallRun();
        t1.start(); //run primero uno luego otro, start ambos juntos, run lo trae como un metodo normal, start lo trata como hilo
        t2.start();
    }
}
