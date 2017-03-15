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
class Banco 
{
    float Interes()
    {
        return 0;
    }
}
class Bancomer extends Banco
{
    float Interes()
    {
        return 8.4f;
    }
}
class HSBC extends Banco
{
    float Interes()
    {
        return 7.3f;
    }
}
class Bancoppel extends Banco
{
    float Interes()
    {
        return 9.7f;
    }
}
public class EjercicioPolimorfismo {
    public static void main(String[] args) {
        Banco b;
        b = new Bancomer();
        System.out.println("La tasa de interés de Bancomer es: "+b.Interes());
        
        b = new HSBC();
        System.out.println("La tasa de interés de HSBC es: "+b.Interes());
        
        b = new Bancoppel();
        System.out.println("La tasa de interés de Bancoppel es: "+b.Interes());
    }
}
