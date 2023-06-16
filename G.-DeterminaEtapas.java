package com.mycompany.DeterminaEtapas;
import java.util.Scanner;
public class DeterminaEtapas {
static int Edades = 0;

        public static void main(String[] args) {
        Solicitar();
        Edades();
    }
        public static void Solicitar(){
        
           Scanner save =new Scanner(System.in);
           
           System.out.println("Colcar tu edad:");
           
           Edades = save.nextInt();
    }
        public static void Edades(){
        //mayor a 0 años, pero menor a o igual a 9 infante
        if (Edades<=9 && Edades >=0  )
        {
           System.out.println("Eres un infante");  
        }
        //Mayor o igual a 10 años o igual o menor a 14 es pequeño
        if (Edades<=14 && Edades>=10)
        {
           System.out.println("Eres un niño pequeño");  
        }
        //Mayor o igual a 14 pero 29 años o menor adolecnete
        if (Edades>=14 && Edades <=29)
        {
           System.out.println("Eres un adolecente");  
        }
        //Mayor o igual a 30 años pero menor o igual a 79 adulto mayor
        if (Edades>=30 && Edades <=79)
        {
           System.out.println("Adulto mayor");  
        }    
        // mayor o igual  a 80 abuelo
        if (Edades>=80)
        {
           System.out.println("Abuelito");  
        }    
    }
}

