package tema3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // definición de variables
        int entradaUsuario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        entradaUsuario = sc.nextInt();

        while(entradaUsuario != 0){
            if(entradaUsuario % 2 == 0){
                System.out.println(entradaUsuario + " es par.");
            }else {
                System.out.println(entradaUsuario + " es impar.");
            }

            System.out.println("Introduzca un número: ");
            entradaUsuario = sc.nextInt();
        }
        sc.close();
    }

}
