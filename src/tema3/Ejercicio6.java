package tema3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // declaración de variables
        int sumaEdades = 0;
        int contador = 0;
        int mayoresEdad = 0;
        double mediaAlumnos;
        int entradaUsuario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la edad del alumno:");
        entradaUsuario = sc.nextInt();
        while(entradaUsuario > 0){
            contador++;
            sumaEdades = entradaUsuario + sumaEdades;
            if(entradaUsuario >= 18){
                mayoresEdad++;
            }
            System.out.println("Introduce la edad del alumno:");
            entradaUsuario = sc.nextInt();
        }

        mediaAlumnos = sumaEdades / contador;

        System.out.println("Nº Alumnos: " + contador);
        System.out.println("Nº Alumnos Mayores de edad: " + mayoresEdad);
        System.out.println("Edad media de todos los alumnos: " + mediaAlumnos + " años.");
        System.out.println("Suma de la edad de todos los alumnos: " + sumaEdades + " años.");
        sc.close();
    }

}
