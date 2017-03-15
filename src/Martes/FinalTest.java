/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/*
La palabra reservada FINAL en java es usada para hacer una RESTRICCIÓN 
Puede ser usada en muchos contextos, como:
    1.- Variable -> No se puede cambiar el valor
    2.- Método -> No se puede redefinir
    3.- Clase -> No puede ser heredada    
*/
/*final*/ class Bicicleta
{
    final int LIMITEVELOCIDAD = 90;
    /*final*/ void run()
    {
        //LIMITEVELOCIDAD = 400;
    }
}
public class FinalTest extends Bicicleta {
    void run() {System.out.println("corriendo");}
}
