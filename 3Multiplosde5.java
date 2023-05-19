package multiplosde5;

/**
 *
 * @author jonathan steve 
 */
public class Multiplosde5 {

    /**
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