/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplosde5;

/**
 *
 * @author jonathan steve 
 */
public class Multiplosde5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int Inicio = 1; int Fin = 100;
        
        System.out.print("Multiplos del 5 ["+Inicio + "," + Fin + "]:");
        for ( int i = Inicio; i <= Fin; i++){
            if (i % 5 == 0){
                System.out.print(i + " ");
                
            }
        }
        System.out.print("Estos son todos los multiplos de 5 a 100");
    }
    
}