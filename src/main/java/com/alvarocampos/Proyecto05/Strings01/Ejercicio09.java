package com.alvarocampos.Proyecto05.Strings01;

import  java.util.Scanner;

public class Ejercicio09 {
    public static String caracteresPosicionesImpares(String frase) {
        StringBuilder resultado = new StringBuilder();

        String[] palabras = frase.trim().split("\\s+");

        for (String palabra : palabras) {
            for (int i = 1; i < palabra.length(); i += 2) {
                resultado.append(palabra.charAt(i));
            }
            resultado.append(" ");
        }
        return resultado.toString().trim();
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
                System.out.println(caracteresPosicionesImpares(frase));
            }
        }

        sc.close();
    }
}
