package com.mycompany.CifrasNumero;
import java.util.Scanner;

public class CifrasNumero {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        
        if (numero < 10) {
            System.out.println("El número es de una cifra.");
        } else if (numero < 100) {
            System.out.println("El número es de dos cifras.");
        } else if (numero < 1000) {
            System.out.println("El número es de tres cifras.");
        } else if (numero < 10000) {
            System.out.println("El número es de cuatro cifras.");
        } else if (numero < 100000) {
            System.out.println("El número es de cinco cifras.");
        } else {
            System.out.println("El número no es válido.");
        }

        
        scanner.close();
    }
}
