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
public class TestIO2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("c:\\cadena.txt");
            String s = "Que magico";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Listo...");
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
