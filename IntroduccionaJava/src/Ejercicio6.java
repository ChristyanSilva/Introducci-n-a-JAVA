/*
Desarrolle un programa en java que calcule el índice de masa corporal
BMI el cual está dado por la formula (pesoenKg / alturaenmetros*
alturaenmetros)
 */

import java.util.Scanner;
/**
 *
 * @author Christyan
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in) ;
        float peso, altura, bmi;
       
        System.out.println("Digite su peso en Kilogramos:");
        peso = entrada.nextFloat() ;
        System.out.println("Ahora digite su altura en metros");
        altura = entrada.nextFloat() ;
        
        bmi= peso/(altura*altura);
        
        System.out.println("El indice de masa corporal es de: "+Math.round(bmi)+"kg/m^2");
    }
    
}
