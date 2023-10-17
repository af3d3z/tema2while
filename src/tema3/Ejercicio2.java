package tema3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int entradaUsuario = 0;

        System.out.println("Introduce un número:");
        entradaUsuario = sc.nextInt();


        while(entradaUsuario >= 0) {
            contador++;
            System.out.println("Introduce un número:");
            entradaUsuario = sc.nextInt();
        }


        System.out.println("Número de enteros positivos introducidos por el usuario: " + contador);
        sc.close();

    }

}
