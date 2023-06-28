package com.mycompany.whilemedia;

import java.util.Scanner;

public class Whilemedia {

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int num, suma, elementos;
        float media;
        
        System.out.println("introduzca un numero: ");
        num = entrada.nextInt();
        
        suma=0;
        elementos=0;
        
        while(num>=0){
            suma+=num;
            elementos++;
            
            
            System.out.println("introduce otro numero: ");
            num=entrada.nextInt();
            
                
            }
                media = (float)suma/elementos;
                System.out.println("la media es de:" + media);
                
            }
            
        }
    

