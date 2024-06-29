package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digige un mes del anio");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "estacion x";
        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "verano";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "otonio";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "invierno";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "primavera";
                break;
            default:
                estacion = "no existe";
        }
        System.out.println("la estacion del anio es:" + estacion);
    }
}
