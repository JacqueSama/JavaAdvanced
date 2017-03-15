/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

/*
Herencia: Es un mecanixmo en el cual los objetos adquieren todas las propiedades y comportamientos de la clase padre.
La idea detras de la herencia es que puedas crear nuevas clases construidas a partir de ya existentes como base.
Cuando heredas de una clase existente puedes añadir también nuevos métodos.

Por qué usar herencia...
Para sobreescritura de métodos
Para reutilizar código

Sintaxis básica
class Subclass-nombre extends Superclass-nombre{
métodos y atributos
}

La palabra reservada extends indica que estás haciendo una nueva clase derivada de la que ya existe. El significado de la palabra
extends es incrementer la funcionalidad.
En terminologías de java una clase que hereda a otras clases es llamada super clase o clase padre, las clases derivadas son llamadas
clases hijas o sub clases.

herencia multiple instanceS
*/
public class Empleado {
    float salario = 4000;
}

class Programador extends Empleado
{
    int bono = 10000;
    public static void main(String[] args) {
        Programador p = new Programador();
        System.out.println("El salario es: "+p.salario);
        System.out.println("El bono es: "+p.bono);
    }
}
