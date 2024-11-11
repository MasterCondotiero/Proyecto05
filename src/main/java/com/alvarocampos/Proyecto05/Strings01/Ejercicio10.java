package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio10 {
    public static boolean palindromo(String palabra) {
        palabra = palabra.toLowerCase();

        String palabraInvertida = new StringBuilder(palabra).reverse().toString();

        return palabra.equals(palabraInvertida);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra para verificar si es palindroma: ");
        String palabra = sc.nextLine();

        if (palindromo(palabra)) {
            System.out.println("La palabra \"" + palabra + "\" es palindroma.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es palindroma.");
        }
        sc.close();
    }
}
