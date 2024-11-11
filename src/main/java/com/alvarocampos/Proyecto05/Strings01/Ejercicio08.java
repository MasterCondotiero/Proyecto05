package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio08 {
    public static void palabrasEncadenadas(String frase) {
        String[] palabras = frase.trim().split("\\s+");

        for (String palabra : palabras) {
            System.out.printf("%-15s %-15s%n", palabra, palabra);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean textoValido = false;

        System.out.println("Pasame la frase que quieras:");

        String frase = sc.nextLine();
        while (!textoValido) {
            if (frase.trim().isEmpty() || frase.matches("^[0-9]*$")) {
                System.out.println("No me has pasado ningun texto.");
                System.out.println("Vuelva a pasarme la frase que quieres, pero ahora escribe algo:");
                frase = sc.nextLine();
            } else {
                textoValido = true;
                palabrasEncadenadas(frase);
            }
        }

        sc.close();
    }
}
