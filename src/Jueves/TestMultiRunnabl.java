/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class TestMultiRunnabl implements Runnable{
    public void run()
    {
        show();
        escribe();
    }
    void show()
    {
        System.out.println("Tarea 1");}
        void escribe()
        {
            try{
                FileOutputStream fos= new FileOutputStream("c:\\hilos.txt");                     
                     int[] array = {79, 108, 97,95,107,69,95,65,99, 101};
                        fos.write(/*array*/65);//solo recibe bytes
                        fos.close();
            }catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new TestMultiRunnabl()); 
        Thread t2 = new Thread(new TestMultiRunnabl());
        
        t1.start();
        t2.start();
        
    }
}
