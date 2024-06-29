/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite un numero");
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "numero desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "uno";
                break;
            case 2:
                numeroTexto = "dos";
                break;
            case 3:
                numeroTexto = "tres";
                break;
            case 4:
                numeroTexto = "cuatro";
                break;
            default:
                numeroTexto = "no existe";
        }
    }
}