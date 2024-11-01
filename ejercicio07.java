import java.util.Scanner;
/**
 * ejercicio07
 */
public class ejercicio07 {

    public static void main(String[] args) {
        /*
         Escribe un programa que solicite al usuario dos números y 
         luego realice las operaciones de suma, resta, multiplicación y división con
         esos números. Muestra los resultados en la consola.
         */
        var calculadora = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        var  num1 = calculadora.nextLine();
        System.out.println("Ingrese el segundo número: ");
        var num2 = calculadora.nextLine();

        calculadora.close();
        //operaciones
        var suma = Double.parseDouble(num1) + Double.parseDouble(num2);
        var  resta = Double.parseDouble(num1) - Double.parseDouble(num2);
        var multiplicacion = Double.parseDouble(num1) * Double.parseDouble(num2);
        var  division = Double.parseDouble(num1) / Double.parseDouble(num2);

       //resultados
       System.out.println("La suma de los dos números es: "+suma);
       System.out.println("La resta de los dos números es: "+resta);
       System.out.println("La multiplicación de los dos números es: "+multiplicacion);
       System.out.println("La división de los dos números es: "+division);
       
    }
}

