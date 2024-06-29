/*
 leer 2 numeros
-si son iguales que los multiplique,
si el primero es mayor que los reste,
sino que los sume
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite 2 numeros");
        var numero1 = Integer.parseInt(entrada.nextLine());
        var numero2 = Integer.parseInt(entrada.nextLine());
        var resultado = 0; 
        
        if(numero1 == numero2){
            resultado = numero1 * numero2;
        }else if(numero1 > numero2){
            resultado = numero1 - numero2;
        }else{
            resultado = numero1 + numero2;
        }
        
        System.out.println("el resultado es: "+resultado);
}
}
