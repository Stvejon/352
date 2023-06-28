package com.mycompany.tipoclima;
import java.util.Scanner;

public class TipoClima {
    public static void main(String[] args) {
        double tp;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la temperatura: ");
        tp = entrada.nextDouble();

        if (tp <= 10) {
            System.out.println("La temperatura es FRIO");
        } else if (tp > 10 && tp <= 20) {
            System.out.println("La temperatura es NUBLADO");
        } else if (tp > 20 && tp <= 30) {
            System.out.println("La temperatura es CALUROSO");
        } else if (tp > 30) {
            System.out.println("La temperatura es TROPICAL");
        }
    }
}
