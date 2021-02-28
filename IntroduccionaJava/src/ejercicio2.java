/*
Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los números del usuario e imprima la
suma, producto, diferencia de los números.
 */

/**
 *
 * @author Christyan
 */
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args ) {
        Scanner entrada = new Scanner(System.in) ;
        int x, y , suma, producto, diferencia ;
        
        System.out.println("Digite un número:");
        x = entrada.nextInt() ;
        System.out.println("Digite el segundo número:");
        y = entrada.nextInt() ;
        suma = x+y ;
        producto = x*y ;
        diferencia = x-y ;
       
        System.out.println("La suma de los dos números es: "+ suma);
        System.out.println("El producto de los números es: "+ producto);
        System.out.println("La diferencia de los números es: "+ diferencia);
        
        
    }
    
}
