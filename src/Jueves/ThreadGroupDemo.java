/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;
/*
Java proporciona una forma conveniente de agrupar multiples hilos en un solo objeto.
De esta manera podemos suspender, reanudar o interrumpir el grupo de hilos mediante
    unas sola llamada al método.
Sólo hay dos constructores de la clase ThreadGroup
1.- ThreadGroup(String name) crea un grupo de hilos con nombre 
2.- ThreadGroup(ThreadGroup parten, String name) crea un grupo de hilos con nombre de grupo
    y nombre.

Métodos importantes de la clase ThreadGroup
1) int activeCount() regresa el número de hilos activos en el grupo actual.
2) int activeGroupCount() regresa el número de grupos activos en este grupo.
3) void destroy() destruye este grupo de hilos y subgrupos
4) ThreadGroup getParent() regresa el padre de este grupo
5) String getName() regresa el nombre del grupo
6) void interrupt () interrumpe todos los hilos de este grupo
7) void list() imprime información de este grupo en consola estandar.
*/
public class ThreadGroupDemo implements Runnable{
    public void run()
    {
        show();
    }
    void show(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Grupo Padre"); //como la liebre, forma larga
        Thread t1 = new Thread(tg1, runnable, "uno");
        Thread t2 = new Thread(tg1, runnable, "dos"); //
        Thread t3 = new Thread(tg1, runnable, "tres");
        
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("Nombre del grupo: "+tg1.getName());
        tg1.list();
                
    }
}
