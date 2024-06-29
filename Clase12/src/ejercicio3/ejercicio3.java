/*
 *La calificacion final de un estudiante de informática

se calcula con base a las calificaciones de cuatro aspectos de su

rendimiento académico:
participación,
primer examen parcial, 
segund examen parcial
y examen final. 

Sabiendo que las calificaciones anteriores

entran a la calificación final con ponderaciones de 10%, 25%, 25%

y 40%

Hacer un programa que calcule e imprima la calificación final

obtenida por un estudiante. 

Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,

la calificación final.
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("las 4 notas del alumno: ");
        var nota1 = Integer.parseInt(entrada.nextLine());
        var nota2 = Integer.parseInt(entrada.nextLine());
        var nota3 = Integer.parseInt(entrada.nextLine());
        var nota4 = Integer.parseInt(entrada.nextLine());

        var notafinal = (nota1 * 0.1) + (nota2 * 0.25) + (nota3 * 0.25) + (nota4 * 0.5);
        System.out.println("las notas final del alumno es: " + notafinal);
    }
}
