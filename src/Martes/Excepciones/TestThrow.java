/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Excepciones;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class TestThrow {
    void m()throws IOException //excepcion de entrada y salida
    {
        throw new IOException("device error");
    }
    void n()throws IOException
    {
        m();
    }
    void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("Exception handled");
        }
    }
    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        obj.p();
        System.out.println("Normal Flow");
    }
            
    static void validate (int age)
    {
        if (age <18)
            throw new ArithmeticException("niño rata");
        else
            System.out.println("Welcome to pornpage");
    }
    public static void main(String args) {
        validate(12);
        System.out.println("resto del codigo");
    }
}
