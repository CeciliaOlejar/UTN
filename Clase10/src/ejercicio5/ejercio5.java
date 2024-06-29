package ejercicio5;

import java.util.Scanner;

public class ejercio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digige un numero del 1 al 10");
        var calificacion = Integer.parseInt(entrada.nextLine());
        if (calificacion >= 9 && calificacion < 10) {
            System.out.println("A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("c");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("d");
        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("f");
        } else {
            System.out.println("fuera de rango");
        }
    }
}
