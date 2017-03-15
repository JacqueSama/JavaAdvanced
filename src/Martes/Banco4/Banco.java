/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Banco4;

/**
 *
 * @author HP
 */
/*
abstract class                                  | Interface
1.-Tiene metoddos abstractos y no abstractos    |   1.-Solo tiene metodos abstractos, desde java 8 tiene metodos default y estaticos
2.-No soportan herencia multiple                |   2.-Soportan herencia multiple
3.-Tienen variables finales, estaticas y no     |   3.-Solo tienen variables estaticas y finales.
    estaticas   
4.- Puede proveer la implementeción de una      |   4.-No pueden proveer una implementacion de una clase abstracta 
    interface
5.-La palabra abstrac declara una clase         |   5.-La palabra interface es usada para declarar una interface
    abstracta

public abstrac class Shape {                        public interface Drawable{
    public abstract void draw();                        void draw();
}                                                   }
*/
interface Bank {
    float getRateOfInterest();
}
class Bancomer implements Bank
{
    public float getRateOfInterest()
    {
        return 7;
    }
}
class HSBC implements Bank
{
    public float getRateOfInterest()
    {
        return 8;
    }
}
class Banamex implements Bank
{
    public float getRateOfInterest()
    {
        return 9;
    }
}
public class Banco {
     public static void main(String[] args) {
        Bank b;
        b = new Bancomer();
        System.out.println("La tasa de interés es: "+b.getRateOfInterest()+"%");
        b = new Banamex();
        System.out.println("La tasa de interés es: "+b.getRateOfInterest()+"%");
        b= new HSBC();
        System.out.println("La tasa de interés es: "+b.getRateOfInterest()+"%");
    }
}
