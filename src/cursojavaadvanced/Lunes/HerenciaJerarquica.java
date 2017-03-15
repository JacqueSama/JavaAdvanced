/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

/**
 *
 * @author HP
 */
public class HerenciaJerarquica {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.nacen();
        cat.crecen();
    }
}
class Animales
{
    void nacen()
    {
        System.out.println("Nacen");
    }
}
class Cat extends Animales
{
    void crecen()
    {
        System.out.println("Crecen");
    }
}
class Dog extends Animales 
{
    void mueren()
    {
        System.out.println("lo atropellé jajaja");
    }
}