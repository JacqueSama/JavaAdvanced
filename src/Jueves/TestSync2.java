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
class Tabla
{
    synchronized void printTable(int n)
    {
        //Metodo sincronizado
        for (int i = 1; i<=5; i++)
        {
            System.out.println(n*i);
            try{
                Thread.sleep(200);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

class Myt extends Thread{ 
    Tabla t; Myt(Tabla t) { this.t=t;}
     public void run(){ t.printTable(5);//comportamiento para el hilo 1
     }
}
class Myt2 extends Thread{
    Tabla t; Myt2(Tabla t) { this.t=t;}
     public void run(){ t.printTable(100);//comportamiento para el hilo 2
     }
}  

public class TestSync2 {
    public static void main(String[] args) {
        //solo un objeto
        Tabla ob = new Tabla();
        
        Myt t1 = new Myt(ob);
        Myt2 t2 = new Myt2(ob);
        
        t1.start();
        t2.start();
        
    }
}
