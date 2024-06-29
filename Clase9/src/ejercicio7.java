
import java.util.Scanner;

/*
 una compania de venta de autos paga al personal un salario de 1000$ mensuales
mas una comision de 150$por cada auto cendido, mas el 5%del valor del auto.
Hacer un programa que calcule e imprima el salario mensual del vendedor
 */
public class ejercicio7 {
    public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
    final int salario = 1000;
    int comision = 150,venta;
    float salarioM,ventaA, porcVenta, totalprecio;
    
    System.out.println("ingrese la cant de autos vendidos");
    venta = Integer.parseInt(entrada.nextLine());
    System.out.println("ingrese el precio del auto");
    ventaA = Float.parseFloat(entrada.nextLine());
    
    comision *= venta;
    totalprecio = ventaA * venta;
    porcVenta = totalprecio * 0.05f;
    salarioM = salario + comision + porcVenta;
    System.out.println("el salario mensual es: "+ salarioM); 
    }
    
}
