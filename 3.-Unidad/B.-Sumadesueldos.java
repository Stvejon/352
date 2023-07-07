package com.mycompany.sumadesueldos;
import java.util.Scanner;

public class Sumadesueldos {
    public static void main(String[] args) {
        int cantidadSueldos = 10;
        double sumaSueldos = 0;
        int sueldosMayores1000 = 0;
        double sueldoMaximo = Double.MIN_VALUE;
        double sueldoMinimo = Double.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= cantidadSueldos; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            double sueldo = scanner.nextDouble();

            sumaSueldos += sueldo;

            if (sueldo > 1000) {
                sueldosMayores1000++;
            }

            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }

            if (sueldo < sueldoMinimo) {
                sueldoMinimo = sueldo;
            }
        }

        double promedioSueldos = sumaSueldos / cantidadSueldos;

        System.out.println("Suma de sueldos: " + sumaSueldos);
        System.out.println("Cantidad de sueldos mayores a 1000: " + sueldosMayores1000);
        System.out.println("Promedio de sueldos: " + promedioSueldos);
        System.out.println("Sueldo máximo: " + sueldoMaximo);
        System.out.println("Sueldo mínimo: " + sueldoMinimo);

        
    }
}

