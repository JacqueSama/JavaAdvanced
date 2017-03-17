/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves.Inputouput;

import static java.awt.PageAttributes.MediaType.C;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Java I/O
Entrada y Salida 
Se utiliza para procesar la entrada y la salida.
Java utiliza el concepto de flujo (stream) para hacer la operación
E/S sea rápida.
El paquete java.io contiene todas las clases necesarias para las 
operaciones de entrada y salida.

Podemos realizar el manejo de archivos a traves de Java I/O API

STREAM
    Es un flujo de datos, compuesto por bytes.
    Se llama stream por que es como un flujo de agua que sigue corriendo.

    En java existen 3 streams que se crean para nuestro uso automáticamente.
        1.-System.out: flujo de sálida estándar.
        2.-System.in: flujo de entrada estándar.
        3.-System.err: flujo de errores estándar.

        System.out.println("Error");
        System.err.print("Error");
        
OutputStream vs InputStream
Input: Lee
Output: Escribe

socket=puente
*/
//FileOutputStream
public class TestIO {
    public static void main(String[] args) {
        try{
            FileOutputStream fos= new FileOutputStream("C:\\hola.txt");
            fos.write(65);//en ascii
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
