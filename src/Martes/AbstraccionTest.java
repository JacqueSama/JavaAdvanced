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
abstract class Bici
{
    Bici()//las clses abstractas tienen constructores
    {
        System.out.println("La bicicleta se creó");
    }
    abstract void run();
    void changeColor()
    {
        System.out.println("Color cambiado");
    }
}
class Magistroni extends Bici
{
    void run()
    {
        System.out.println("Soy una bicicleta :v");
    }
}
public class AbstraccionTest {
    void run()
    {
        System.out.println("La bici corre de manera segura");
    }
    public static void main(String[] args) {
        Bici bici = new Magistroni();
        bici.run();
        bici.changeColor();
    }
}
