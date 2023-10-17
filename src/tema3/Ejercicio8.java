package tema3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int arbolMasAlto = 0;
        int entradaUsuario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del árbol (cm):");
        entradaUsuario = sc.nextInt();

        while(entradaUsuario > 0) {
            if(entradaUsuario > arbolMasAlto){
                arbolMasAlto = entradaUsuario;
            }
            System.out.println("Introduce la altura del árbol (cm):");
            entradaUsuario = sc.nextInt();
        }
        System.out.println("El árbol más alto mide: " + arbolMasAlto + " cm.");
        sc.close();
    }

}
