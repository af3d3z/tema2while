package tema3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // declaración de variables
        int entradaUsuario;
        int sumaPositivos = 0;
        int contadorNegativos = 0;
        int sumaNegativos = 0;
        double mediaNegativos = 0;
        int contadorCeros = 0;
        int contador = 1;
        Scanner sc = new Scanner(System.in);

        while(contador <= 10){
            System.out.println("(" + contador + ") " + "Introduce un número:");
            entradaUsuario = sc.nextInt();

            if(entradaUsuario == 0){
                contadorCeros++;
            }else if(entradaUsuario < 0){
                contadorNegativos++;
                sumaNegativos = sumaNegativos + entradaUsuario;
            }else {
                sumaPositivos = sumaPositivos + entradaUsuario;
            }

            contador++;
        }

        // si se han introducido negativos se hará la media y si no, se quedará en 0
        if(contadorNegativos != 0){
            mediaNegativos = (double) sumaNegativos / contadorNegativos;
        }

        System.out.println("Nº de ceros introducidos: " + contadorCeros);
        System.out.println("Suma de números positivos: " + sumaPositivos);
        System.out.println("Media de números negativos: " + mediaNegativos);

        sc.close();
    }
}
