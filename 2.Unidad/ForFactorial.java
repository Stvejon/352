package com.mycompany.forfactorial;

import java.util.Scanner;


public class ForFactorial {

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        double factorial;
        int num;
       System.out.println("introduce el numero:");
        num= entrada.nextInt();
        factorial=1;
        for (int i = num; i > 0; i--){
        factorial=factorial*1;
        
    }
         System.out.println("El factorial " + num +" es:" +factorial);
    }
}
