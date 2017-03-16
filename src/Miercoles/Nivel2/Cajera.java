/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles.Nivel2;

/**
 *
 * @author HP
 */
public class Cajera extends Thread{
    private String nombre;
    private Cliente cliente;
    private long initialTime;
    
    public Cajera(){
        
    }
   
    
    public Cajera(String nombre,Cliente cliente, long initialTime)
    {
        this.nombre = nombre; //constructor con parametro
        this.cliente= cliente;
        this.initialTime= initialTime;
    } 
    public String getNombre(){return nombre;}
    public long getInitialTime(){return initialTime;}
    public Cliente getCliente(){return cliente;}
    public void setNombre(String nombre)
    {
        this.nombre = nombre; //se cambia el nombre porque es un hilo
    }
    /**
     * Método para esperar X cantiad de segundos 
     * @params int seg
     */
    private void esperarXsegundos(int segundos)
    {
        try{
            Thread.sleep(segundos * 1000);
        }catch (InterruptedException ie){
            Thread.currentThread().interrupt();//si entra al catch, se detiene para que no se cicle
            System.out.println(ie);
        }
    }
    
    /**
     * Método procesar compra
     
     * @param long timeStamp
     */
    public void run()
    {
        //comienza la comrpa
        System.out.println("La cajera: "
                +this.nombre+" ha comenzado a procesar la compra del cliente "
                +cliente.getNombre()+"\n en un tiempo de: "
                +(System.currentTimeMillis() -this.initialTime)/1000+" seg.");
        
        //registra los productos
        for(int i=0; i<cliente.getCarroCompra().length; i++)
        {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el prodcuto: "+(i+1)+
                    " en el tiempo: "+(System.currentTimeMillis() -this.initialTime)/1000);
        }
        System.out.println("La cajera: "+this.nombre+" ha terminado de procesar los productos del cliente "
                +cliente.getNombre()+" en el tiempo "+(System.currentTimeMillis() -this.initialTime)/1000+" seg.");
    }
    
}
