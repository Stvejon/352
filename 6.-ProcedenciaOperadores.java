package com.mycompany.Procedenciadeoperaciones;
package Procedenciadeoperaciones;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Procedenciadeoperaciones {

   
       
    static double 
       a=0, b=0, c=0,
       d=0, e=0, f=0,
       g=0, h=0, j=0,
       m=0, n=0, p=0,
       q=0, r=0, s=0,
       x=0, y=0;
         
    public static void main(String[] args) {
        solicitarDatos();
        
        Operaciones
           (a, b, c, d, e, f, g, h, j, m, n, p, q, r, s, x, y);
 
    }
    public static void solicitarDatos(){
       Scanner entrada= new Scanner(System.in);
       System.out.println("Colocar valor de a");
       a = entrada.nextInt();
       System.out.println("Colocar valor de b");
       b = entrada.nextInt();
       System.out.println("Colocare valor de c");
       c = entrada.nextInt();
       System.out.println("Colocar valor de d");
       d = entrada.nextInt();
       System.out.println("Colocar valor de e");
       e = entrada.nextInt();
       System.out.println("Colocar valor de f");
       f = entrada.nextInt();
       System.out.println("Colocar valor de g");
       g = entrada.nextInt();
       System.out.println("Colocar valor de h");
       h = entrada.nextInt();
       System.out.println("Colocar valor de j");
       j = entrada.nextInt();
       System.out.println("Colocar valor de m");
       m = entrada.nextInt();
       System.out.println("Colocar valor de s");
       s = entrada.nextInt();
       System.out.println("Colocar valor de x");
       x = entrada.nextInt();
       System.out.println("Colocar valor de y");
       y = entrada.nextInt();
       System.out.println("Colocar valor de n");
       n = entrada.nextInt();
       System.out.println("Colocar valor de p");
       p = entrada.nextInt();
       System.out.println("Colocar valor de q");
       q = entrada.nextInt();
       System.out.println("Colocar valor de r");
       r = entrada.nextInt();
    }
    
    public static void Operaciones(double a,double b,double c,double d,double e,
            double f,double g,double h, double j,double m,double n,double p,double q,double r,
            double s, double x,double y){
       
       //OPERACIONES  formula
       DecimalFormat df = new DecimalFormat ("#.00");
        //***************  A 
        double calculaA;
        calculaA = (3/2) + (4/3);
        System.out.println("a)" + df.format (calculaA));
        //***************  B
        double calculaB;
        calculaB = (1/ (x-5)) - (3*(x*y))/4;
        System.out.println("b)" + df.format ( calculaB));
        //***************  C
        double calculaC;
        calculaC = ((1/2)+7);
        System.out.println("c)" + df.format (calculaC));
        //***************  D
        double calculaD;
        calculaD = (7+(1/2));
        System.out.println("d)" + df.format ( calculaD));
        //***************  E
        double calculaE;
        double cuadrado = Math. pow(a, 2);
        calculaE = ((a*a)/(b-c)) + (((d-e) / (f - ((g*h)/j))));
        System.out.println("e)" + df.format ( calculaE)); 
        //***************  F
        double calculaF;
        calculaF = (m/n)+ p;
        System.out.println("f)" + df.format (calculaF));
        //***************  G
        double calculaG;
        calculaG = m + (n/(p-q));
        System.out.println("g)" + df.format ( calculaG));
        //***************  H
        double calculaH;
        double cuadra = Math. pow(b, 2);
        double cuadr = Math. pow(c, 2);
        double cuad = Math. pow(d, 2);
        calculaH = ((a + cuadrado)/(b + cuadra)) + ((c + cuadr)/(d + cuad));
        System.out.println("h)" + df.format ( calculaH));
        //***************  I
        double calculaI;
        calculaI = (m + (n/p)/ q - (r/s));
        System.out.println("i)" + df.format ( calculaI));
        //***************  J
        double calculaJ;
        calculaJ = (((3*a) + b)) / (c - ((d + (5*e))/(f + (g/ (2*h)))));
        System.out.println("j)" + df.format ( calculaJ));
        //***************  K
        double calculaK;
        calculaK = ((a*a)+(2*(a*b))+(b*b))/((1/(x*x))+2);
        System.out.println("k)" + df.format ( calculaK));      
        
    }
}
