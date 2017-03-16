/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;


public class TwiceTest extends Thread{
    public void run(){
        System.out.println("Corriendo..");
    }
    public static void main(String[] args) {
        TwiceTest t1 = new TwiceTest(); 
        
        t1.start();
       throw new IllegalThreadStateException("ya lo cache");
   }
}
