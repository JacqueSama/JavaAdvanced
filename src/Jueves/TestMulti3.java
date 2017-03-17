/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

/*
Si tienes que realizar multiples tareas con multihilos, debes tener multiples metodos run()
 */
class simpleA extends Thread
{
    public void run()
    {
        System.out.println("Tarea uno");//se hace el metodo en la clase
    }
}
class simpleB extends Thread
{
    public void run()
    {
        System.out.println("Tarea dos :P");
    }
}

public class TestMulti3 {
    public static void main(String[] args) {
        simpleA t1 = new simpleA();
        simpleB t2 = new simpleB();
        
        t1.start();
        t2.start();
    }
}
