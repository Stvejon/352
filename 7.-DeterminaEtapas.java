package com.mycompany.CiFrasNumero;
package programacion9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CiFrasNumero {
    public static void main(String[] args)throws IOException{ 
        //Declaracion de variables
        int numero;
        
        BufferedReader bufEntrada = new BufferedReader (new InputStreamReader (System.in));
                // Entrada de datos
                System.out.println("Dame el numero");
                numero = Integer.parseInt(bufEntrada. readLine ());
                                   
                if(numero<10 && numero>=1)
                { 
                    System.out.println("Es de una cifra");
                }
                else if (numero<100 && numero>=10)
                {
                   System.out.println("Es de 2 cifras"); 
                }
               else if (numero<1000 && numero>=100)
               {
                System.out.println("Es de 3 cifras");   
               }
               else if (numero<=10000 && numero>=1000)
               {
                System.out.println("Es de 4 cifras");   
               }
               else if (numero<100000 && numero>=10000)
               {
                System.out.println("Es de 5 cifras");   
               }
               else if (numero<=0) 
               {
                System.out.println("No hay numeros menores a 0");   
               } 
  }
}
