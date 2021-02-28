/*
 Juan conoce el precio de compra y de venta de unos de los productos
de su tienda y requiere conocer cuál es su % de utilidad.
Desarrolle un programa en java que lo ayude con ese cálculo
 */


import java.util.Scanner;

/**
 *
 * @author Christyan
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in) ;
      float com, ven, uti;
      
        System.out.println("Por favor digita el precio de compra del producto:");
        com = entrada.nextFloat() ;
        System.out.println("Ahora digita el precio de venta de dicho producto:");
        ven = entrada.nextFloat() ;
        uti= ven-com;
        System.out.println("El porcentaje de utilidad del producto es:"+uti);
                
    }
    
}
