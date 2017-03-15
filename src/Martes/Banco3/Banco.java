/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Banco3;

/**
 *
 * @author HP
 */
abstract class Banco {
    abstract int getRateOfInterest();
}
class Bancomer extends Banco
{
    int getRateOfInterest()
    {
        return 7;
    }
}
class HSBC extends Banco
{
    int getRateOfInterest()
    {
        return 8;
    }
}
class Banamex extends Banco
{
    int getRateOfInterest()
    {
        return 9;
    }
}

class TestBanco
{
    public static void main(String[] args) {
        Banco b;
        b = new Bancomer();
        System.out.println("La tasa de interés es: "+b.getRateOfInterest()+"%");
        b = new Banamex();
        System.out.println("La tasa de interés es: "+b.getRateOfInterest()+"%");
        b= new HSBC();
        System.out.println("La tasa de interés es: "+b.getRateOfInterest()+"%");
    }
}
/*
las interfaces se comunican atraves de hilos
*/