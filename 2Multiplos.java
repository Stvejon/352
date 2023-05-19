/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;

/**
 *
 * @author jonathan steve 
 */
public class Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Inicio = 1;
        int Fin = 100;
        
        System.out.print("Multiplos de 3 ["+Inicio + "," + Fin + "]:");
        for ( int i = Inicio; i <= Fin; i++){
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
    
}
