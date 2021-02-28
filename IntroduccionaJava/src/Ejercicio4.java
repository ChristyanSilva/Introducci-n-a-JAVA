/*
Escriba un programa en Java que le solicite al usuario el valor del radio de una circunferencia y calcule su longitud y
área. Imprima los resultados (con dos números decimales)
 */

import java.util.Scanner;
/**
 *
 * @author Christyan
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, longitud, area;
        
        Scanner entrada = new Scanner(System.in) ;
         
        System.out.println("Digite el radio de la circunferencia");
        radio = entrada.nextFloat() ;
        longitud=Math.round((2*radio)*3.1415) ;
        area= Math.round((radio*radio)*3.1415) ;
        
        System.out.println("La longitud es: " +longitud);
        System.out.println("El área es: "+ area);
        
    }
}
    