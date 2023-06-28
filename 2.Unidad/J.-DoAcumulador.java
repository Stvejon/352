
package com.mycompany.doacumulador;

import java.util.Scanner;


public class DoAcumulador {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num, suma;
        suma=0;
      do{
        System.out.println("Introduzca el numero: ");
        num =entrada.nextInt();
        suma=suma + num;
        
     }while(num!=0);
      
      System.out.println("La suma de todos es: "+ suma);
}
}
