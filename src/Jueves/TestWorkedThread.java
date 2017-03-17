/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author HP
 */
public class TestWorkedThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);//administrador de hilos, con 5 hilos
        
        for (int i =0; i < 10; i++) // 10 elementos
        {
            Runnable worked = new WorkedThread(" "+i);  //que sea un hilo runnable
            executorService.execute(worked);
        }
        executorService.shutdown();//apagar el pool de hilos
        while (!executorService.isTerminated());//mientras no este terminado 
        System.out.println("Muertos todos");
    }
}
