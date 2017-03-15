/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/*

*/
class Persona
{
    int id;
    String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
}
class Emp extends Persona
{
    float salario;
    Emp(int id, String nombre, float salario)
    {
        super(id,nombre);
        this.salario = salario;
    }
    /*para que sirve crear constructor: pojo automatizado*/
    void display()
    {
        System.out.println("ID "+id+" Nombre "+nombre+" Sueldo "+salario);
    }
}
public class SuperTest2 {
    public static void main(String[] args) {
        Emp e = new Emp(1,"Jorge", 4500);
        e.display();
    }
}
