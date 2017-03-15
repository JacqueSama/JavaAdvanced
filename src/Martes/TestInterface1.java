/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

//declaracion de la interface definida por el usuario
interface drawable
{
    void draw();
}
//implementacion por un segundo usuario
class Rec1 implements drawable
{
    public void draw()
    {
        System.out.println("Dibujando un rectangulos liriririri");
    }
}
class Cir1 implements drawable
{
    public void draw ()
    {
        System.out.println("Dibujando un circulo");
    }
}
//usando las interfaces por un tercer usuario
public class TestInterface1 {
    public static void main(String[] args) {
        drawable d = new Cir1();
        //En un escenario real, el objeto provee el método
        //getDrawable
        d.draw();
    }
    
}
