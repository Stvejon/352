package com.mycompany.switchcalificaciones;


import java.io.*;
import java.util.Scanner;

public class SwitchCalificaciones {


    public static void main(String[] args) throws IOException{
        //Definir valores
        Scanner entrada = new Scanner(System.in);
        int calificacion;
        
        //Datos de entrada 
        System.out.println("Introduzca la calificacion: ");
        calificacion = entrada.nextInt();
        
        //Proceso de operacion matematica
        
        //Datos de salida
         switch(calificacion)
         {
             case 0: 
              System.out.println("MUY MAL.");
              break; 
             case 1:
             case 2:
             case 3:
             case 4:
             case 5:
              System.out.println("INSUFICIENTE.");
              break;
             case 6:
              System.out.println("SUFICIENTE.");
              break;
             case 7:
             case 8:
              System.out.println("BIEN.");
              break;   
             case 9:
              System.out.println("NOTABLE.");
              break;
             case 10:
              System.out.println("SOBRESALIENTE.");
              break;
             default:
              System.out.println("ERROR DE CALIFICACION.");
              break;   
         }
    }
}


   
