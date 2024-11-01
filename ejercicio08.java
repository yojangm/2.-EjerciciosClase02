import java.util.Scanner;
public class ejercicio08 {
    public static void main(String[] args) {
        /*
         Crea un programa que calcule el área y el perímetro de un rectángulo. 
         Solicita al usuario la longitud y el ancho del rectángulo.
         longitud es lo mismo que decir base
         y ancho  es lo mismo que decir altura
         */
        Scanner calculo = new Scanner(System.in);

        System.out.println("Ingresa  la longitud del rectángulo:");
        var base  = calculo.nextLine ();
        System.out.println("Ingresa  el ancho del rectángulo:");
        var altura = calculo.nextLine();

        calculo.close();

        //operaciones 
        var area = Integer.parseInt(base) * Integer.parseInt(altura);
        var perimetro = 2 * (Integer.parseInt(base) + Integer.parseInt(altura));

        //resultados
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perimeto  del rectángulo es: " + perimetro);




        
    }
    
}
