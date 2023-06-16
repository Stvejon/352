package com.mycompany.banderacalificacion;
import java.util.Scanner;

public class BanderaCalificacion {
    static int c1, c2, c3, c4, c5;
    
    public static void main(String[] args) {
        pedirCalificaciones();
        calificacionReprobada(c1, c2, c3, c4, c5);
    }
    
    public static void pedirCalificaciones() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la calificación 1:");
        c1 = entrada.nextInt();
        
        System.out.println("Introducir calificación 2:");
        c2 = entrada.nextInt();
        
        System.out.println("Introducir calificación 3:");
        c3 = entrada.nextInt();
        
        System.out.println("Introduzca la calificación 4:");
        c4 = entrada.nextInt();
        
        System.out.println("Introducir calificación 5:");
        c5 = entrada.nextInt();
    }
    
    public static void calificacionReprobada(int c1, int c2, int c3, int c4, int c5) {
        boolean bandera1;
        boolean bandera2;
        boolean bandera3;
        boolean bandera4;
        boolean bandera5;
        
        bandera1 = (c1 <= 5);
        System.out.println("Calificación reprobatoria: " + bandera1);
        
        bandera2 = (c2 <= 5);
        System.out.println("Calificación reprobatoria: " + bandera2);
        
        bandera3 = (c3 <= 5);
        System.out.println("Calificación reprobatoria: " + bandera3);
        
        bandera4 = (c4 <= 5);
        System.out.println("Calificación reprobatoria: " + bandera4);
        
        bandera5 = (c5 <= 5);
        System.out.println("Calificación reprobatoria: " + bandera5);
    }
}
