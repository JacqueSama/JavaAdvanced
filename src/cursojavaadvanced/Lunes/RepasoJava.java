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
public class RepasoJava {
    public static void main(String[] args) {
        System.out.println("Hola Coppel");
        
        String hola = "Hola COPPEL";
        System.out.println(hola);
        
        int a = 3;
        System.out.println(a);
        
        int edad = 23;
        if(edad> 18)
            System.out.println("es mayor de edad");
        if(edad>21)
        {
            System.out.println(edad);
        }
        else
            System.out.println("es más joven que 21");
        
        //If statement
        int marca = 65;
        if (marca < 50){
            System.out.println("Error");
        }else if (marca >= 50 && marca < 60){
            System.out.println("Grado D");
            }else if (marca >=60 && marca <70){
                System.out.println("Grado C");
                }else if (marca >=70 && marca <80){
                    System.out.println("Grado B");
                    }else if (marca>=80 && marca <90){
                        System.out.println("Grado A");
                        }else if (marca >=90 && marca<100){
                            System.out.println("Grado A+");
                            }else System.out.println("Inválido");
        
        //Swicth statement
        int numero = 10;
        switch (numero){
            case 10: 
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:System.out.println("No es 10, 20 ni 30");
        }
        
        //For Bucle desde; hasta; incremento
            for (int i = 1; i<=10; i++)
            {
                System.out.println(i);
            }
            
        //For each
        int arreglo []={1,22,33,44,56};
        
            for (int loQueSea : arreglo){
            System.out.println(loQueSea);
            }
            
            //while
         int b = 1;
            while ( b <=10 ){
            System.out.println(b);
            b++;
            }
            
            //Do while
            int n = 1;
            do{
                System.out.println("Hago algo");
                n++;
            }while (n<=10);
            
            //Break
            for (int l = 1; l<=10; l++)
            {
                if(l==5){
                    break;
                }
                System.out.println(l);
            }
            
            //Continue statement
            for (int l = 1; l<=10; l++)
            {
                if (l == 5)
                {
                    continue;
                }
                System.out.println(l);
            }            
    }
}
