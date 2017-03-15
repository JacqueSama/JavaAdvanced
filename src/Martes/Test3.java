/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/**
 *
 * Diferencias entre thorw y throws en Java
 * throw                                                            |   throws
 * 1.-palabra reservad usada para manejar una excepcion explicita       1.-palabra reservada para declarar uan excepcion
 * 2.Es usada sin método                                            |   2.-es usado en la signatura de un metodo
 * 3.No puede manejare excepciones múltiples                            3.-Puede manejar múltiples excepciones usando una coma
 * 
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
    //ejemplo throw
    void m()
    {
        throw new ArithmeticException("la excepcion es aritmética");
    }
    //ejemplo throws
    void j () throws ArithmeticException
    {
        //body
    }
    //ejemplo juntos
    void h () throws ArithmeticException
    {
        throw new ArithmeticException("hola");
    }
}
