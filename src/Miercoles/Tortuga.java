/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;

public class Tortuga extends Thread{
    public void run() //cuando usamos thread, run es un método
    {
        int i = 1;
        System.out.println("Inicia la tortuga");
        while(i<=10)
        {
            try{
                Thread.sleep(5000);
                System.out.println("ha dado "+i+" pasos la tortuga...");
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
            i++;
        }
        System.out.println("Ya llegó la tortuga");
    }
}
