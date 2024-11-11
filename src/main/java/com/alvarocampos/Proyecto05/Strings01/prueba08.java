package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class prueba08 {
    public static void palabrasSeparadas(String frase) {
        // Split the sentence into words based on whitespace
        String[] palabras = frase.trim().split("\\s+");

        // Print each word on a new line
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean textoValido = false;

        System.out.println("Pasame la frase que quieras:");

        // Loop to ensure we get valid input
        String frase = sc.nextLine();
        while (!textoValido) {
            if (frase.trim().isEmpty() || frase.matches("^[0-9]*$")) {
                System.out.println("No me has pasado ningun texto.");
                System.out.println("Vuelva a pasarme la frase que quieres, pero ahora escribe algo:");
                frase = sc.nextLine();
            } else {
                textoValido = true;
                System.out.println("Palabras individuales:");
                palabrasSeparadas(frase); // Print each word on a new line
            }
        }

        sc.close();
    }
}
