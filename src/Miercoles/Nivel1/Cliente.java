/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles.Nivel1;

/**
 *
 * @author HP
 */
//POJO plain old java object
public class Cliente {
    private String nombre;
    private int[] carroCompra;
    
    public Cliente()
    {
        
    }
    public Cliente(String nombre, int[]carroCompra)
    {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }
    public String getNombre()
    {
        return nombre;
    }
    /*public void setNombre() esto se hace en el constructor this.
    {
        this.nombre = nombre;
    }*/
    public int[] getCarroCompra()
    {
        return carroCompra;
    }
    
}
