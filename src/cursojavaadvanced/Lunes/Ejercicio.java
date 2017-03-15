/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

/**
 *
 * @author HP
 */
public class Ejercicio {
    public static void main(String[] args) {
        /*Realizar los siguientes ejercicios
            A)serie de fibonacci
            verificar si un numero es primo
            calcular el factorial de un numero
            */
         //fibonacci
        int n1 = 0, n2 = 1;
        int aux;
        int limite = 100;
        
        System.out.println("Serie fibonacci");
        System.out.print(n1);
        System.out.print(" "+ n2);
 
        while (n2 + n1 <= limite) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;
 
            System.out.print(" "+n2);
        }
        
        //numeros primos
        System.out.println(" ");
        System.out.println("Números primos menores a 100");
        for (int i = 1; i <= 100; i++ ) { 
            int divisores = 0; 
            int numeroActual = 0;
            for (int e = 1; e <= i; e++) { 
                numeroActual = e;
                if ( (i % e) == 0) divisores++; 
                /*Explicación*/if (divisores == 2)  {break;}
            }
            if (numeroActual == i && i != 1)  System.out.print (i+" "); 
        }
        
        //numero primo
        System.out.println(" ");
        int i = 15;
            int divisores = 0; 
            int numeroActual = 0;
            for (int e = 1; e <= i; e++) { 
                numeroActual = e;
                if ( (i % e) == 0) divisores++; 
                /*Explicación*/if (divisores == 2)  {break;}
            }
            if (numeroActual == i && i != 1) { System.out.print (i+ " es primo"); }
            else { System.out.print (i+ " no es primo");}
        
        
      int fac=10;
      int a=Factorial(fac); // Se hace el llamado a la funcion Factorial con el int fac
      System.out.println(" ");
      System.out.println("Factorial de " + fac+" es: "+a);
        
    }
    
    //factorial
    public static int Factorial(int n){
      if(n==1 || n==0)
         return 1;
      else
         return n*Factorial(n-1);
    }
}
