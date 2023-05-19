
package multiplos;

/**
 *
 * @author jonathan steve 
 */
public class Multiplos {

    /**
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
