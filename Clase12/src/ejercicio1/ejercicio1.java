/* Construir un programa que, dado un número total de

horas, devuelve el número de semanas, días y horas equivalentes.

Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,

6 días y 16 horas.
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite un numero total de horas");
        var totalhoras = Integer.parseInt(entrada.nextLine());

        // Calcular semanas, días y horas
        int semanas = totalhoras / (7 * 24);
        int dias = (totalhoras % (7 * 24)) / 24;
        int horas = totalhoras % 24;
        System.out.println(totalhoras + " horas son equivalentes a:");
        System.out.println(semanas + " semanas, " + dias + " días y " + horas + " horas.");

    }
}
