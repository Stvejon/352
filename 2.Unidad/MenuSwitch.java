package com.mycompany.menuswitch;

import java.util.Scanner;

public class MenuSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        int respuesta;
        
        System.out.println("Menu");
        System.out.println("1. SwitchCalificaciones");
        System.out.println("2. SwitchCajero");
        System.out.println("3. CodigoDescuento");
        System.out.println("Elige un numero de programa");
        
        respuesta = entrada.nextInt();
        
        switch(respuesta)
        {
            case 1:
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
                break;
            case 2:
                 final int saldo_inicial=1000;
        int opcion;
        double ingreso,saldoActual,retiro;
        
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
                break;
            case 3:
                 double PV = 1000;
        
        int descuento = 0;
        double precioFinal;
        String codPromocion;
        
        // Entrada de datos
        System.out.println("Su total de compra es: $" + PV + "\n");
        System.out.println("Tienes un codigo de descuento, escríbelo:");
        codPromocion = entrada.next();
        codPromocion = codPromocion.toUpperCase();
         
        // Proceso
        // Salida de datos
        switch(codPromocion) {
            case "PLATINOOCTUBRE":
                descuento = 20;
                break; 
               
            case "SILVEROCTUBRE":
                descuento = 50; 
                break;
             
            case "BRONCEOCTUBRE":
                descuento = 35;
                break;
                
            case "OROOCTUBRE":
                descuento = 75;
                break;    
                
            default:
                System.out.println("Se ha introducido un código de descuento inválido.");
                break;
        }
        
        precioFinal = PV - (PV * descuento / 100); // Restar el descuento al precio original
        System.out.println("El total con el descuento aplicado es: $" + precioFinal);
                break;
        }
    }
}
