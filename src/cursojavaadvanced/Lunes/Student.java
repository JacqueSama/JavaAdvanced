/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

/*
Constructor: Tipo especial de método usado para inicializar los objetos.
En java un constructor es invocado en el tiempo de ejecución.
Reglas para crear un constructor en java
    Básicamente son dos reglas para definir un constructor
    1.- Constructor tiene SIEMPRE el MISMO Nombre de la CLASE
    2.- Constructor no tiene un tipo de retorno explícito.

    Tipos de Constructores
    1.- Default(No parametrizados)
    2.- Parametrizados
    
    Constructor por default: No tiene parametros así que es el default.
    Sintaxis base
    <class_name>(){}
    El constructor por default provee los valores de inicio de los objetos tales como 0, null, etc dependiendo de el tipo.

    Diferencias entre un Constructor y un Método Constructor
    Constructor
        Es usado para inicializar el estado de un objeto
        No tiene tipo de retorno
        Es invocado implícitamente
        El compilador de java provee un constructor por default si no tienes uno
        El nombre del constructor es el mismo que el de la clase

    Metodo
        Es usado para exponer el COMPORTAMIENTO del objeto
        Tiene un valor de retorno
        Es invocado explícitamente
        No lo provee el compilador de ningún caso
        Puede o no tener el mismo nombre de la clase

Un constructor puede realizar otras tareas ademas de la inicializadora como, crear objetos, iniciar un hilo, llamar un método.
Puedes realizar cualquier operación como en los métodos.

*/
public class Student {
    int id;
    String nombre;
    int edad;
    
    Student()
    {
        System.out.println("Soy un constructor por default");
    }
    
    //Con 2 parametros
    Student(int i, String n)
    {
        id = i;
        nombre = n;
    }
    //con 3 parametros

    public Student(int a, String b, int c) {
        id = a;
        nombre = b;
        edad = c;
    }
    
    void display()
    {
        System.out.println("ID: "+id+" Estudiante: "+nombre);
    }
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student(69, "aie zy");
        Student student3 = new Student(010, "Jorge", 24);
        
        student.display();
        student2.display();
        student3.display();
    }
}
