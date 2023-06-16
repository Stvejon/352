

package com.mycompany.edadesmayor;

import java.util.Scanner;


public class edadesmayor {


    public static void main(String[] args) {
    
    //DeCLARACION DE VARIALES
        Scanner Edades =new Scanner (System.in);
        int Edad;

    //Entrada de datos
        System.out.println("Da tu edad");
        Edad = Edades.nextInt();

    //Salida
        System.out.println(MayoroMenor(Edad));

    }
    
    public static String MayoroMenor (int Edad)
    {
    
        //Salida de datos
        
     if (Edad < 18)
     {
         return "Menor";
     }
        if (Edad >= 18)
            
        {
     
         return "Mayor";
     }

      return "no hay nada";
     
    }

}
