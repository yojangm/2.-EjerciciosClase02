import java.util.Scanner;
public class ejercicio09 {
    public static void main(String[] args) {
        /*
         Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin. 
         Usa las siguientes fórmulas:

         Fahrenheit = Celsius * 9/5 + 32
         Kelvin = Celsius + 273.15
         */

         var temperartura = new Scanner(System.in);
         System.out.println("Ingrese la temperatura en grados Celsius: ");
         var  celsius = temperartura.nextLine();
         temperartura.close();
         // operaciones
         var fahrenheit = Double.parseDouble(celsius)*(9d/5)+32;
         var  kelvin = Double.parseDouble(celsius)+273.15;
         // resultados 
         System.out.println("Los grados celsius ingresados son: "+celsius);
         System.out.println("Los grados fahrenheit son: "+fahrenheit);
         System.out.println("Los grados  kelvin son: "+kelvin);





    }
}
