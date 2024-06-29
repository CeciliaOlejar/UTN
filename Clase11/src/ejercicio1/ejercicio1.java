/*
 *Determinar si un alumno aprueba o reprueba un curso sabiendo que aprueba
si de 3 calificaciones su promedio es mayor o igual a 70
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite las 3 calificaciones");
        var nota1 = Integer.parseInt(entrada.nextLine());
        var nota2 = Integer.parseInt(entrada.nextLine());
        var nota3 = Integer.parseInt(entrada.nextLine());

        var promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 70) {
            System.out.println("el aulumno esta aprobado con:" + promedio);

        } else {
            System.out.println("el alumno esta reprobado con: " + promedio);
        }
    }
}
