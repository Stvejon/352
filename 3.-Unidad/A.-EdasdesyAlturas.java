package com.mycompany.edasdesyalturas;

import java.util.Scanner;

public class edasdesyalturas {

    public static void main(String[] args) {
        //Declarar variables 
        Scanner entrada= new Scanner(System.in);
       int edad, media_edad, suma_edad,mayor_edad,mayor_175;
       double altura, media_altura, suma_altura; 
       //Inicializar variables 
       mayor_edad=0; media_altura=0;mayor_175=0; suma_edad=0;suma_altura=0;
       
       //proceso
       for (int i=1; i<= 5; i++){
           System.out.print("********");
           System.out.print("*Alumno NO."+i+"*");
           System.out.print("*Introduzca la edad +");
           edad=entrada.nextInt();
            System.out.print("*introduzca la altura*");
            altura=entrada.nextDouble();
            if(edad>=18){
                mayor_edad++;
            }
           if(altura>1.75){
               mayor_175++;
           } 
           suma_edad=suma_edad+edad;
           suma_altura=suma_altura+altura;
            }//termina ciclo fOR
       media_edad=suma_edad/5;
       media_altura=suma_altura/5;
       //salida de datos
        System.out.print("*La edad media  es de:" + media_edad + "*");
        System.out.print("*La altura media  es de:" + media_altura + "*");
        System.out.print("*cantidad> a 18:" + mayor_edad+ "*");
        System.out.print("*cantidad> a 1.75:" + mayor_175+ "*");
    }
}
