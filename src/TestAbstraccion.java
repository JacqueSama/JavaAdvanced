/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 Una clase declarada con la palabra reservada Abstract se considera abstracta.
 * Puede ser abstracta con métodos no abstractos
 * 
 * La abstraccion es un proceso para ocultar los detalles de implementación y mostrar
 * sólo la funcionalidad al usuario.
 * Osea, mostrar solo las cosas importantes para el usuario, ocultando los detalles
 * internos.
 * 
 * Enviar SMS solo escribe el texto y lo envías, No conocemo el proceso interno sobre
 * la entrega del mensaje.
 * 
 * La abstracción permite concentrarse en LO QUE HACE EL OBJETO en lugar 
 * de COMO LO HACE.
 * 
 * Formas de logar la Abstracción
 * 1.- Clase Abstracta (0 al 100%)
 * 2.- Interface (100%)
 * 
 * Una clase declarada como abstract se conoce como abstracta , necesita ser extendida
 * (extends) e implementar sus métodos. No se puede instanciar.
 * 
 * abstract class A {}
 * 
 * Un método que es declarado como abstract no tiene implementaciones.
 * abstract void printStatus();
 */

abstract class Bicycle
{
    abstract void run(); // lo que hace
}
abstract class Shape
{
    abstract void draw();
}
class Rectangulo extends Shape
{
    void draw(){
        System.out.println("Dibujando un rectangulo");
    }
}
class Circle extends Shape // interface
{
    void draw()
    {
        System.out.println("dibujando un circulo");
    }
}
public class TestAbstraccion extends Bicycle{
    void run()
    {
        System.out.println("Corriendo felizmente"); // como lo hace
    }
    
    public static void main(String[] args) { // en el main creo el objeto
        Bicycle bicycle = new TestAbstraccion(); //upcasting
        bicycle.run();
        
        Shape s = new Circle();
        s.draw();
    }
}
