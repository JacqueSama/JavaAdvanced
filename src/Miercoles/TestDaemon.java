/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;

/*
Un hilo Demonio en java es un hilo proveedor de servicios que proporciona servicios al hilo de usuario. Su vida depende de 
los demás hilos, es decir si todos los demás hilos se mueren la JVM lo termina automáticamente.

Hay muchos hilos demonios en java que se ejecutan automáticamente.
gc, finalizer, etc

Jconsole en el simbolo del sistema, proporciona la información sobre las clases cargadas, uso de memoria, ejecución de hilos, etc.

Puntos importantes
Un hilo en java proporciona servicios a los hilos para brindar soporte a tareas en segundo plano.
Su vida depende de los hilos del usuario
Es un hilo de baja prioridad.
Java.lang.Thread provee dos métodos para un demonio
1.- public setDaemon(boolean status) es usado para marcar el hilo actual, como un hilo demonio
2.- public boolean isDaemon() revisas si el hilo actual es un demonio-proveen SER-VI-CIOS
*/
public class TestDaemon extends Thread{
    public void run()
    {
        if (Thread.currentThread().isDaemon())
        {
            System.out.println("baia baia, tenemos un demonio aquí");
        }else
        {
            System.out.println("Ah no, es un hilo de usuario");
        }
    }
    public static void main(String[] args) {
        TestDaemon t1 = new TestDaemon(), t2 = new TestDaemon(), t3= new TestDaemon();
        
        t1.setDaemon(true);//transformarlo antes de que inicie
        t1.start();
        t2.start();
        t3.start();
    }
}
