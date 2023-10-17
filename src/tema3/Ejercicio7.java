package tema3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numSecreto, entradaUsuario;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        numSecreto = 1 + random.nextInt(100);

        System.out.println("Introduzca un número: ");
        entradaUsuario = sc.nextInt();
        while((entradaUsuario != numSecreto) && entradaUsuario > 0){
            if(entradaUsuario > numSecreto){
                System.out.println("El número introducido es mayor al número secreto");
            }else{
                System.out.println("El número introducido es menor al número secreto.");
            }
            System.out.println("Introduzca un número: ");
            entradaUsuario = sc.nextInt();
        }
        System.out.println("El número secreto era: " + numSecreto);

        sc.close();
    }
}
