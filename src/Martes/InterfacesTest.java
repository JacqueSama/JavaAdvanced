/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/**
 Una interface es un plano de una clase.
 * Tiene constantes estáticas y métodos abstractos.
 * 
 * Interface en java es un mecanismo que permite lograr la abstracción.
 * Sólo puede haber métodos abstractos en la interfaz, osea métodos sin cuerpo.
 * Permiten la Herencia Múltiple.
 * No se puede instanciar como uan clase abstracta.
 * 
 * 3 razon para usar interfaces
 *  1.- Para lograr la abstracción
 *  2.- Para soportar la funcionalidad de herencia múltiple
 *  3.- Para lograr un (loose coupling) desacoplamiento.
 * 
 * En java 8 una interface tiene por default métodos estáticos
 * 
 * interface Printable{     |               |interface Printable{
 * int min= 5;              |    COMPILADOR |   Public static final int MIN=5;
 * void print();            |               |   public abstract void print();
 * }                        |               |}
 * Printable.java                               Printable.class
 */
/*
las interfaces se comunican atraves de hilos
corbats
*/
interface printable
{
    void print();
}

class Hola implements printable
{
    public void print()
    {
        System.out.println("Ola ke ase");
    }
    public static void main(String[] args) {
        Hola saludo = new Hola();
        saludo.print();
    }
}
public class InterfacesTest {
    
}
