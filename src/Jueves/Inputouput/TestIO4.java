/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves.Inputouput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.IOError;

/**
 *
 * @author HP
 */
public class TestIO4 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream ("c:\\cadena.txt");
            int i = 0;
            while ((i=fis.read())!=-1)
            {
                System.out.print((char)i);
            }
            fis.close();
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
