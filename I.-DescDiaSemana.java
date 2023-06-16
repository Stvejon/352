package com.mycompany.descdiasemana;

import java.util.Scanner;

public class DescDiaSemana {
    public static void main(String[] args) {
        String dia;
        double monto_compra, descuento, total1, total2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de compra: ");
        monto_compra = entrada.nextDouble();
        System.out.print("Ingrese el dia de semana: ");
        dia = entrada.next();

        descuento = 0.15 * monto_compra;
        total1 = monto_compra - descuento;
        total2 = monto_compra;

        if (dia.equals("martes") || dia.equals("jueves")) {
            System.out.println("El Descuento es: " + descuento);
            System.out.println("El total es: " + total1);
        } else {
            System.out.println("El total es: " + total2);
        }
    }
}

