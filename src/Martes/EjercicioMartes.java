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
class Bank
{
    float Interes()
    {
        return 0;
    }
}
class SBI extends Bank
{
    float Interes()
    {
        return 8;
    }
}
class ICICI extends Bank
{
    float Interes()
    {
        return 7;
    }
}
class AXIS extends Bank
{
    float Interes()
    {
        return 9;
    }
}
public class EjercicioMartes {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        
        System.out.println(sbi.Interes());
        System.out.println(icici.Interes());
        System.out.println(axis.Interes());
    }
}
/*
Un método estático no puede ser redefinido porque el método estático
está enlazado con la clase, mientras que el método de la instancia 
está enlazado con el objeto.

OVERRIDE: (SOBREESCRIBIR )Redefinir -> Un metodo ya existente para cambiar su implementacion.
OVERLOAD: SOBRECARGA -> Cambair argumentos y tipos de la signatura, signatura es el encabezado del metodo

*/