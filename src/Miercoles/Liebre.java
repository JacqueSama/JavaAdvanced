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
public class Liebre implements Runnable{
    public void run() //con runnable, detecta a run interface
    {
        int i =1;
        System.out.println("Inicia la liebre");
        
        while(i<10)//casi todos los hilos se manejan por while
        {
            try{
                Thread.sleep(2000);
                System.out.println("La liebre dio "+i+" pasos");
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
            i++;
        }
        System.out.println("Llegó la liebre");
    }
}
