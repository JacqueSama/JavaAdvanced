/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Animales;

/**
 *
 * @author HP
 */
class Animal
    {
        void eat()
        {
            System.out.println("comiento...");
        }
    }
    class Gato extends Animal
    {
        void eat()
        {
            System.out.println("Comiendo wiskas...");
        }
    }
    class Kitty extends Gato
    {
        void eat()
        {
            System.out.println("toma leche");
        }
    }
public class Animales{
    public static void main(String[] args) {
        Animal Misa;
        Misa = new Animal();
        Misa.eat();
        
        Misa = new Gato();
        Misa.eat();
        
        Misa = new Kitty();
        Misa.eat();
        
        
    }
}
