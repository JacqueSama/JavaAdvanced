/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/**
 *
 * @author HP
 */
public class Test3 {
    public static void main(String[] args) {
        try
        {
            int dato = 25/5;
            System.out.println(dato);
        }catch(NullPointerException nepe){
            System.out.println(nepe);
        }finally {
            System.out.println("Este bloque SIEMPRE SE EJECUTA");
        }
        System.out.println("lo que sea dosmil ocho");
    }
}
