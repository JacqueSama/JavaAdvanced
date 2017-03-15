/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/**
 *Si uan clase tiene diferentes métodos con el mismo nombre pero diferentes parámetros se conoce como Sobrecarga de métodos
 * 
 * Ventajas de la SobreCarga de métodos
 * -Incrementa la legibilidad del programa
 * 
 * Diferentes formas de sobrecargar un método
 *  1.- Cambiando el número de argumentos
 *  2.- Cambiando el tipo de datos
 *  
 * @author HP
 */

class Añadido
{
    //caso 1
    static int add(int a, int b)
    {
        return a + b;
    }
    static int add (int a, int b, int c)
    {
        return a+b+c;
    }
    //caso 2
    static int suma (int c, int d)
    {
        return c + d;
    }
    static double suma(double c, double d)
    {
        return c + d;
    }
    /*
    En java no es posible sobrecargar un método cambiando solamente el tipo de retorno.
    static int add(int a, int b) {return lo que sea}
    static double add(int a, int b){return lo que sea}
    Ambigüedad
    */
}
public class OverloadingTest {
    public static void main(String[] args) {
        //caso 1
        System.out.println(Añadido.add(111, 222));
        System.out.println(Añadido.add(11,111,111));
        //caso 2
        System.out.println(Añadido.suma(12.5, 17.8));
        System.out.println(Añadido.suma(12, 12));
        
    }
    /*
    El método main se puede sobrecargar y tener cualquier cantidad de métodos main, sin embargo la JVM sólo va a ejecutar el que 
    tiene como argumento un arreglo de strings
    
    class overload()
    {
        public static void main (String [] args){System.out.println("main con String[]");
        public static void main (String args){System.out.println("main con String");
        public static void main (){System.out.println("main sin args");
        Solo imprime el main 1}
    }
    */
}
