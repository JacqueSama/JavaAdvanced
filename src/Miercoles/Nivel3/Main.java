/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles.Nivel3;

/**
 *
 * @author HP
 */
public class Main implements Runnable{
    private Cajera cajera;
    private Cliente cliente;
    private long initialTime;
    
    public Main(Cliente cliente, Cajera cajera, long initialTime)
    {
        this.cajera = cajera;
        this.cliente = cliente;
        this.initialTime=initialTime;
    }
    public static void main(String[] args) {
        Cliente paco = new Cliente("Francisco",new int[]{1,2,3,4});
        Cliente Sergio = new Cliente("Sergio",new int[]{1,1,1,1});
        
        Cajera claudia = new Cajera("Claudia");
        Cajera david = new Cajera("David");
        
        //tiempo inicial
        long initialTime = System.currentTimeMillis();
        
        Runnable caja1 = new Main (paco,claudia,initialTime);
        Runnable caja2 = new Main (Sergio,david,initialTime);        
        //Tiempo inicial de referencia
               
        new Thread(caja1).start();
        new Thread(caja2).start();
    }
    public void run()
    {
        this.cajera.procesarCompra(this.cliente,this.initialTime);
    }
}
