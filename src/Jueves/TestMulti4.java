/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

import java.io.FileOutputStream;
import java.io.IOException;

/*

 */
public class TestMulti4 extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread() //objeto anonimo el new Thread
        {
            public void run()//metodo anonimo
            {
                cadena();
                System.out.println("Tarea uno");
            }
        };
        Thread t2 = new Thread()//se hace el metodo en el hilo
        {
            public void run()
            {
                escribe();
                System.out.println("Tarea dos");
            }
        };
        t1.start();
        t2.start();
    }
    
    static void escribe(){
        try{
            FileOutputStream fos = new FileOutputStream("c:\\cadena.txt");
            String s = "Oie ke riko";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Listo...");
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    static void cadena(){
        try{
            FileOutputStream fos= new FileOutputStream("C:\\hola.txt");
            fos.write(65);//en ascii
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
