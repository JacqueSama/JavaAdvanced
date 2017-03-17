/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

/*
La sincronización en java es la capacidad de controlar el acceso de múltiples hilos en cualquier recurso
    compartido.
La sincronización es la mejor opción cuando queremos permitir que solo un hilo pueda acceder a recursos
    comprartidos.
La sincronización es principalmente usada para:
1.- Prevenir la interferencia entre hilos
2.- Prevenir problemas de inconsistencia

Tipos de sincronización
1.- Procesos
2.- Hilos: Mutualmente excluyentes
    1.- Métodos Sincronizados
    2.- Bloque Sincronizado
    3.- Sincronizacion estática

        Cooperacion: Comunicación entre hilos
Exclusión Mutua: Ayuda a prevenir que los hilos interfieran entre si
    mientras comparten información.

Bloqueo: La sincronización se basa en uan entidad interna 
conocida como lock o monitor. Cada objeto tiene un bloqueo
asociado a él. Por convención un hilo necesita un acceso 
consistente a los campos de un objeto, tiene que adquirir 
el bloqueo del objeto antes de acceder a ellos y a 
continuación liberar el bloqueo cuando se hace con ello.

Desde Java 5, el paquete java.util.concurrent.locks
contiene varias implementaciones de bloqueo.

Ejemeplo sin Sincronización.

 */
class Table
{
    void printTable(int n)
    {
        //Metodo no sincronizado
        for (int i = 1; i<=5; i++)
        {
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
class MyT extends Thread
{
    Table t;

     MyT(Table t) {
         this.t=t;
     }
     public void run()
     {
         t.printTable(5);//comportamiento para el hilo 1
     }
}
class MyT2 extends Thread
{
    Table t;

     MyT2(Table t) {
         this.t=t;
     }
     public void run()
     {
         t.printTable(100);//comportamiento para el hilo 2
     }
}    

public class TestSync {
    public static void main(String[] args) {
        //solo un objeto
        Table ob = new Table();
        
        MyT t1 = new MyT(ob);
        MyT2 t2 = new MyT2(ob);
        
        t1.start();
        t2.start();
        
    }
}
