/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

class Tab
{
    synchronized void printTable(int n)
    {
        //Metodo sincronizado
        for (int i = 1; i<=5; i++)
        {
            System.out.println(n*i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

class MYT extends Thread{ 
    Tab t; MYT(Tab t) { this.t=t;}
     public void run(){ t.printTable(5);//comportamiento para el hilo 1
     }
}
class MYT2 extends Thread{
    Tab t; MYT2(Tab t) { this.t=t;}
     public void run(){ t.printTable(100);//comportamiento para el hilo 2
     }
}  
public class TestSync3 {
    public static void main(String[] args) {
        //solo un objeto
        final Tab tabla = new Tab(); //metodo anonimo
        Thread t1 = new Thread()
        {
            public void run()
            {
                tabla.printTable(5);
            }
        };
        Thread t2 = new Thread()
        {
            public void run()
            {
                tabla.printTable(100);
            }
        };
        t1.start();
        t2.start();
    }
}
