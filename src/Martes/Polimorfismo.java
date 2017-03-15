/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/*
Polimorfismo: Concepto mediante el cual podemos realizar una tarea o acción de distintas maneras.
Se deriva de dos palabras griegas: Poly y morphos poly= muchos y morphos=formas
Polimorfismo muchas forams

Tipo de polimorfismo
    1.- Runtime Polymorphism: (Polimorfismo en tiempo de complicación)
    2.- Dynamic Method Disrpach (Polimorfismo en tiempo de ejecución)

    Podemos realizar el polimorfismo en java por sobrecarga de método y redefinición de método.

*/

class Bike
{
    void run()
    {
        System.out.println("running...");
    }
}
public class Polimorfismo extends Bike {
    void run()
    {
        System.out.println("running safely woth 60km");
    }
    
    public static void main(String[] args) {
        Bike b = new Polimorfismo();
        /*Upcasting -> Cuando la variable de referencia de la superclase se refiere
        al objeto de la clase hija
        Class A{}
        class B extends A {}
        A a = new B;
        */
        b.run();
    }
}
