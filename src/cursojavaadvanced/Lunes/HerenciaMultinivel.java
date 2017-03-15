/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

/*

*/
public class HerenciaMultinivel {
    
    public static void main(String[] args) {
        Kitty Conchi = new Kitty();
        Conchi.eat();
        Conchi.juega();
        Conchi.travesuras();
    }
}
class Animal
    {
        void eat()
        {
            System.out.println("comiento...");
        }
    }
    class Gato extends Animal
    {
        void juega()
        {
            System.out.println("jugando...");
        }
    }
    class Kitty extends Gato
    {
        void travesuras()
        {
            System.out.println("se lo comieron los gatos.");
        }
    }