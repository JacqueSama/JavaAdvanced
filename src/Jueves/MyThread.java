/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

/**
 * Java Shutdown Hook
 * El Shutdown hook puede ser utilizado para realizar acciones de limpieza cuando 
 *  o guardar el estado cuando la JVM se apaga abruptamente o normalmente.
 * Realizar acciones de limpieza o recursos de limpieza significa cerrar el archivo
 *  de registro, enviar algunas alertas o algo más.
 * Así que si se desea ejecutar algún código antes de que la JVM se apague utilizamos
 *  Shutdown Hook
 * 
 * Cuando se cierra la JVM?
 * -    Cuando el usuario presiona ctrl +c en la consola
 *      Se invoca el método System.exit(int)
 *      Usuario cierra sesión
 *      El método addShutdownHook(Thread hook)
 *          Este último de la clase RunTime se utiliza para registrar el hilo con la JVM
 * 
 * Sintaxis Básica
 *  public void addShutdownHook(Thread hook){}
 * El objeto de la clase Runtime se puede obtener llamando al método estático factory getRuntime().ej
 *      Runtime r = new Runtime.getRuntime();
 *      
 *      Factory: Método que devuelve una instancia de una clase 
 */
public class MyThread extends Thread{
    public void run(){
        System.out.println("Shut down hook task completed...");
    }
    
}

class TestShutdown
{
    public static void main(String[] args) throws Exception {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MyThread());
        System.out.println("Now main sleeping... press ctrl + c exit");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
