/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/*
SUPER: es una palabra reservada en java como una variable referencia la cual es 
usada para servir de intermediario entre la clase padre y la instancia(subclase).

Usos de Super
    1.- Se puede utilizar para referir la variable de instancai de la clase padre
        inmediata.
    2.- Se puede utilizar para invocar el método de la clase padre inmediato.
    3.- Se puede utilizar para invocar al constructor de la clase padre inmediata.
*/
//Caso 1
class Animal
{
    //caso 3
    Animal()
    {
        System.out.println("El animal fue creado");
    }
    //caso 1
    String color = "Blanco";
    //caso 2
    void eat()
    {
        System.out.println("Comiendo..");
    }
}
class Gato extends Animal
{
    //caso 3
    Gato()
    {
        super();
        System.out.println("Se ha creado un miau");
    }
    //caso 1
    String color = "Negro";
    void printColor()
    {
        //Imprime el color de la clasee gato
        System.out.println(color);
        //Imprime el color de la clase animal
        System.out.println(super.color);
    }
    //caso 2
    void eat()
    {
        System.out.println("Comiendo Whiskas");
    }
    void sleep()
    {
        System.out.println("Durmiendo");
    }
    void run()
    {
        System.out.println("Corriendo");
    }
    void maullar()
    {
        System.out.println("Miau");
    }
    /*Importante   */
    void llamar()
    {
        super.eat();
        maullar();
    }
    
}
public class SuperTest {
    public static void main(String[] args) {
        //caso 1
        Gato darka = new Gato();
        darka.printColor();
        
        //caso 2
        Gato conchita = new Gato();
        conchita.llamar();
    }
}
