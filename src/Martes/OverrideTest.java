/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/**
Si una subclase tiene el mismo método declarado en la clase padre se le conoce como un método redefinido(Sobreescrito)
* En otrs palabras si la subclase provee una implementación específica de un método que ya está provisto en la clase padre
* es porque está redefinido.
* 
* Usos de la redefinición de métodos
*   Para proveer una implementación específica de un método previamente existente en la super clases.
*   Es usado para el polimorfismo en tiempo de ejecución.
* 
* REGLAS de la redefinición de métodos en Java
*   1.- El método debe tener el mismo nombre como en la clase padre
*   2.- El método debe tener los mismos parámetros como en la superclase
*   3.- Debe ser una relación tipo Is A(Heredado).
* cuando hay interfaces no es Is A, es Has A
* Implementecion, el cuerpo del metodo
* polimorfismo, diferentes maneras de un metodo
* 
 */
class Vehiculo
{
    void run()
    {
        System.out.println("El vehículo está corriendo... ");
    }
}
public class OverrideTest extends Vehiculo{
    
    public static void main(String[] args) {
        OverrideTest bicicleta = new OverrideTest();
        bicicleta.run();
    }
    void run()
    {
        System.out.println("la bicicleta está corriendo... ");
    }
}
/*
Sobrecarga (OVERLOADING)                                             |   Sobreescritura (OVERRIDE)
1.- Es usada para incremetar  legibilidad del programa               |    1.-Es usado para proveer la implementacion especifica de un metodo ya establecido en la superclase
2.-En caso de un método sobrecargado los parametros hacen diferencia |    2.-los parametros deben ser los mismos
3.-Se realiza dentro de la clase                                     |    3.-La sustitucion del metodo se produce en dos clases distintas, pero heredadas
4.-Es un ejemplo de Compile Time   Polymorphism                      |    4.-Es un ejemplo de Run Time Polymorphism
5.-No puede realizarse cambiando el tipo de retorno                  |    5.-El tipo de retorno debe ser igual o una variante del metodo redefinido
*/