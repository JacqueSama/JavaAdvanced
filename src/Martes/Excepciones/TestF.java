/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Excepciones;

/*
Diferencia entre final, finally, finalize
FINAL
    1.- Es usado para aplicar restricciones a una clase, método y variables.
        Una clase final no puede ser heredada, un método final no puede ser redefinido, y una variable no puede ser cambiada de valor.
    2.- Final es una palabra reservada.
FINALLY
    1.- Es un bloque 
    2.- Es usado para terminar el manejo de una excepcion, es el bloque de código implícito que siempre se ejecuta.
FINALIZE
    1.- Es usado para realizar el proceso de limpieza justo antes de que llegue el recolector de basura de java.
    2.- Es un método.
 */
class FinalTest
{
    public static void main(String args) {
        final int x = 100;
        //x=200;
    }
}
class FinallyTest
{
    public static void main(String args) {
        try{
            int b = 300;
        }catch (Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Se ejecuta el bloque finally");
        }
    }
}
public class TestF {
    public void finalize ()
    {
        System.out.println("llamada a finalize");
    }
    public static void main(String[] args) {
        FinalTest f1 = new FinalTest(), f2 = new FinalTest();
        f1 = null;
        f2 = null;
        System.gc();
    }
}
