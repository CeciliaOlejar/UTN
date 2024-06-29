/*
 Hacer un programa que calcule el cuadro de una suma,

el usuario debe ingresar el valor de a y el valor de b.

Formula: (a+b)2=a2+b2+2*a*b

Para esto deberán utilizar la clase Math y un método llamado pow
 */
package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el valor de b: ");
        double b = scanner.nextDouble();

        //a^2 + b^2 + 2ab
        double aC = Math.pow(a, 2);
        double bC = Math.pow(b, 2);
        double dosAB = 2 * a * b;
        double resultado = aC + bC + dosAB;

        System.out.println("(" + a + " + " + b + ")^2 = " + resultado);
        System.out.println("Verificación usando Math.pow: " + Math.pow(a + b, 2));
}
}
