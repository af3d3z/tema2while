package tema3;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int entradaUsuario = 0;

        /* sumamos el número introducido en la iteración anterior y pedimos un nuevo número, al usar ese orden no
        * se sumarán los números negativos que introduzca el usuario*/
        while(entradaUsuario >= 0) {
            suma  = suma+entradaUsuario;
            System.out.println("Introduce un número");
            entradaUsuario = sc.nextInt();
        }

        System.out.println("La suma de todos los números es: " + suma);
        sc.close();

    }
}
