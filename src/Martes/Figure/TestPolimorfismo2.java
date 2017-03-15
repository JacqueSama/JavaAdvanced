/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Figure;

class Shape
{
    void draw()
    {
        System.out.println("Dibujando...");
    }
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("Dibujando un rectangulo");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Dibujando un círulo");
    }
}
class Triangle extends Shape
{
    void draw()
    {
        System.out.println("Dibujando un triangulo");
    }
}
public class TestPolimorfismo2 extends Shape{
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle();
        s.draw();
        
        s = new Triangle();
        s.draw();
        
        s = new Circle();
        s.draw();
    }
}
