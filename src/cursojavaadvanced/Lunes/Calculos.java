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
public class Calculos {
  
    void fact(int n)
    {
        int fact=1;
        for (int i=1; i<=n; i++)
        {
            fact= fact*i;
        }
        System.out.println("factorial es: "+ fact);
    }
    public static void main(String[] args) {
        //para objetos anonimos
        new Calculos().fact(3);
    }
    
}
