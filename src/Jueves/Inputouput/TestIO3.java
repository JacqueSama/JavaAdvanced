/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves.Inputouput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class TestIO3 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("c:\\cadena.txt");
            int i = fis.read();
            System.out.println((char)i);
            fis.close();
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
