
import java.util.Scanner;

// guillermo tiene N dolares, luis la mitad. 
//Juan la mitad de lo de luis y guillermo juntos
//calcular la cant de dinero que tienenlos 3

public class ejercicio6 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;
        System.out.println("digite la cant de dinero de guillermo");
        guillermo = Float.parseFloat(entrada.nextLine());
        
        luis = guillermo /2;
        juan = (luis + guillermo)/2;
        total = luis + guillermo + juan;
        System.out.println("EL DINERO DE LUIS ES: "+luis);
        System.out.println("el dinero de juan es:"+juan);
        System.out.println("el dinero total es: "+total);
    }
}
