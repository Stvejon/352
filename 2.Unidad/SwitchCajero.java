package com.mycompany.switchcajero;

import java.util.Scanner;


public class SwitchCajero {

    public static void main(String[] args) {
        //variables
        final int saldo_inicial=1000;
        int opcion;
        double ingreso,saldoActual,retiro;
        Scanner entrada=new Scanner(System.in);
        System.out.println("1. Ingresa dinero a la cuenta");
         System.out.println("2. Retira dinero de la cuenta");
          System.out.println("3. salir");
          
                
        System.out.println("ingresar un numero");
        opcion=entrada.nextInt();
        
        switch(opcion){
            case 1 :
                System.out.println("digite la cantidad que desea ingresar");
                ingreso=entrada.nextDouble();
                saldoActual=saldo_inicial+ingreso;
                System.out.println("El saldo actual es:" + saldoActual);
                break;
            case 2:
                System.out.println("digite la cantidad que desea retirar: ");
                retiro=entrada.nextDouble();
                if(retiro<=saldo_inicial){
                    saldoActual=saldo_inicial-retiro;
                    System.out.println("Dinero en cuenta");
                    
                }
                else{
                    System.out.println("No cuenta con el dinero suficiente: ");
                    
                }
                break;
            case 3: 
                break;
               
            default:   
         
        }
        
        
        
    }
}
