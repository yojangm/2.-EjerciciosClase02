/**
 * ejercicio#1
 */
public class ejercicio01 {
    public static void main(String[] args) {
        int operacion = 6/2*(1+2);
        System.out.println("El resultado de la operación es: "+operacion);
    }
    /*
     ¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
     el resultado correcto es 9, siguiendo el orden jerarquico de operaciones.
     Explique por que la otra calculadora genera un resultado diferente.
     porque no implemento de manera adecuada  el orden jerarquico de operaciones.
     es decir:
     6/2*(1+2)
     6/2*(3)
     6/6
     =1 

    en ese sentido la forma correcta es:
     6/2*(1+2)
     6/2*(3)
     3*3
     =9 


     */


    
}