/*
Se desea un aplicativo en Java que muestre por consola el texto de un menú con cinco opciones. Para ello, se solicita
utilizar solo una instrucción de impresión.
 */


import java.util.Scanner;

/**
 *
 * @author Christyan
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in) ;
    String op1, op2, op3, op4, op5;
    
        System.out.println("A continuación digite el contenido  del menú");
        op1 = entrada.nextLine() ;
        op2 = entrada.nextLine() ;
        op3 = entrada.nextLine() ;
        op4 = entrada.nextLine() ;
        op5 = entrada.nextLine() ;
        System.out.println("El menú quedo de la siguiente manera:");
        System.out.println("1. "+op1);
        System.out.println("2. "+op2);
        System.out.println("3. "+op3);
        System.out.println("4. "+op4);
        System.out.println("5. "+op5);
   
    }
    
}

