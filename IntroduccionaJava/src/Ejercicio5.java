/*
Escriba un programa en Java que lea un carácter e imprima su correspondiente valor numérico (utilizar la conversión
de tipos).
 */


import java.util.Scanner;
/**
 *
 * @author Christyan
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in) ;
        char car ;
       
        System.out.println("Escriba el caracter a convertir: ");
        car= entrada.next().charAt(0);
        long num= Character.getNumericValue(car);
        
        System.out.println("El valor numerico del caracter es:"+num);
    
       
    }
    
}

