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
class Rectangulo
{
    int lenght, width;
    
    void agregar(int l, int w)
    {
        lenght = l;
        width = w;
        
    }
    void calcularArea()
    {
        System.out.println("El área del rectángulo: "+lenght*width);
    }
}


public class PruebaRectangulo {
    
    public static void main(String[] args) {
        //creo un objeto multiple a traves de solo definir uno
        Rectangulo r = new Rectangulo(), r2= new Rectangulo();
        r.agregar(11, 5);
        r2.agregar(3, 15);
        
        r.calcularArea();
        r2.calcularArea();
        
        
    }
    
}
