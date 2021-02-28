/*
Escriba una aplicación que reciba tres valores decimales del usuario y muestre la suma, promedio, producto,
cociente y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas
 */

import java.util.Scanner;

/**
 *
 * @author Christyan
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in) ;
        float x, y, z, suma, promedio, producto, cociente, modulo ;
        
        System.out.println("Digite un número:");
        x = entrada.nextFloat() ;
        System.out.println("Digite el segundo número:");
        y = entrada.nextFloat() ;
        System.out.println("Digite el utimo número:");
        z= entrada.nextFloat() ;
        
        suma= Math.round(x+y+z)  ;
        promedio = Math.round((x+y+z)/3)  ;
        producto = Math.round(x*y*z)  ;
        cociente = Math.round((x/y)/z) ;
        modulo = Math.round(x%y%z);
        
        System.out.println("La suma de los tres números es:"+suma);
        System.out.println("El promedio de los tres números es:"+promedio);
        System.out.println("El producto de los tres números es:"+producto);
        System.out.println("El cociente de los tres números es:"+cociente);
        System.out.println("El modulo de los tres números es:"+modulo);
        
    }
    
}
