/*
 * en un almacen se hace un 20 MOD de descuento a los clientes cuya
compra supere los 100$
calcular lo que pagara una persona
*/
package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite la cantidad a pagar");
        var compra = Integer.parseInt(entrada.nextLine());
        var descuento = 0;
        if(compra>100){
            descuento = (int) (compra *0.2);
            
        }else{
            descuento = 0;
        }
         var precioFinal = compra - descuento;
        
          System.out.println("la cantidad a pagar es: "+precioFinal);
        
    }
}
