/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

/**
 *
 * Objeto: Entidad del mundo real que posee Identida, Estado y Comportamiento
 * Estado: Representa el valor de un objeto
 * Comportamiento: Representa la funcionaliad de un objeto
 * Identidad: Un identificador único como un ID
 * 
 * Objeto es una instancia de una clase
 * 
 * Clase en Java: un grupo de objetos que tienen propiedades comunies
 * Es una plantilla para modelar caracteristicas que cumplan con los objetos
 * Clase contiene
 *  Campos:
 *  Metodos:
 *  Constructores
 *  Bloques
 *  Clases anidadas e interfaces
 * 
 * 3 Formas de inicializar un objeto
 *  1: Por uan variable referencia
 *  2: Por un metodo
 *  3: Por un constructor
 */
public class ObjectAndClass {
    public static void main(String[] args) {
        
        //Creo un objeto llamado es1, de tipo Estudiante
        Estudiante es1= new Estudiante ();
        //imprimir por medio del objeto las caracteristicas
        System.out.println("ID "+es1.id);
        System.out.println(es1.nombre);
        
        //por referencia
        es1.id = 5;
        es1.nombre = "Jacque";
        System.out.println("El id de "+ es1.nombre+" es: "+es1.id);
        
        //Por metodo
        Estudiante es2= new Estudiante();
        es2.insertarRegistro(12, "Adriana");
        es2.displayInfo();
    }
}

class Estudiante
{
    int id ;
    String nombre ;
    //por metodo
    void insertarRegistro(int r, String n)
    {
        id = r;
        nombre = n;
    }
    void displayInfo()
    {
        System.out.println("ID: "+id+" Estudiante: "+nombre);
    }
}
