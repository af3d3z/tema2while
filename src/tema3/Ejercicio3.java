package tema3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int entradaUsuario = 0;
        double media;

        System.out.println("Introduce un número:");
        entradaUsuario = sc.nextInt();

        /* comprobamos si el número introducido es positivo y en caso afirmativo añadimos uno al contador y se lo
        * sumamos a suma, pedimos otro número y se repite hasta que se introduzca un número negativo*/
        while(entradaUsuario >= 0) {
            contador++;
            suma  = suma+entradaUsuario;
            System.out.println("Introduce un número:");
            entradaUsuario = sc.nextInt();
        }
        // calculamos la media y la mostramos por pantalla
        media = (double) suma /contador;

        System.out.println("La media de todos los números es: " + media);
        sc.close();

    }
}
