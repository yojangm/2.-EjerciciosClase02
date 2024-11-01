/**
 * ejercicio10
 */
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        /*
         Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.
         */
        var mediaAritmetica = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        var num1 =  mediaAritmetica.nextLine();
        System.out.println("Introduce el segundo número: ");
        var num2 = mediaAritmetica.nextLine();
        System.out.println("Introduce el tercer número: ");
        var num3 = mediaAritmetica.nextLine();
        mediaAritmetica.close();

        //operaciones
        int resultado = (Integer.parseInt(num1)+Integer.parseInt(num2)+Integer.parseInt(num3))/3;
        System.out.println("La media aritmética de los tres números es: "+resultado);

    }

    
}