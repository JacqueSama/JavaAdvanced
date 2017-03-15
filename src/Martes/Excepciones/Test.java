/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Excepciones;

/*
excepciones son Vivis
5 Palabras usadas en el manejo de excepciones
    1.-try
    2.-catch
    3.-finally
    4.-throw
    5.-throws
*/
public class Test {

    public static void main(String[] args) {
        try{
            try{
                System.out.println("Vamos a dividir");
                int b= 39/0;
            }catch (ArithmeticException ae){
                System.out.println(ae);
            }
            try{
                int a[]= new int[4];
                a[5]=4;
            }catch(ArrayIndexOutOfBoundsException aiobe){
                System.out.println("Cachado");
            }
        }catch(Exception e){
                System.out.println("Otra excepcion");
            }
        System.out.println("FLUJO NORMAL");
    }
    public static void main(String args) {
        try{
           // int dato = 50/0;
           int a[] = new int[5];
           a[5]=30/0;
        } catch (ArithmeticException ae){
            System.out.println(ae);
        } catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println(aiobe);
        } catch (Exception e){
            System.out.println("las tareas comounes se completaron");
        }
        System.out.println("resto del codiogo");
    }
}
