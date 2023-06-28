package com.mycompany.fortablas;


public class Fortablas {

    public static void main(String[] args) {
        //TODO code applicaion logic here
        int i,j ;
        for(i=1; i<=10; i++){
             System.out.println("tabla del "+ i);
              System.out.println("-------------");
              
              for(j=1; j<=10; j++){
               System.out.println(i + "x" + j +" = " + j*i);   
              }
        }
    }
}
