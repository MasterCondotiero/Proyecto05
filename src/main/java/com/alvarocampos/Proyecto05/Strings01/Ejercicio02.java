package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        int contadorVocales = 0;
        int contadorConsonantes = 0;

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (Character.isLetter(caracter)) {
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    contadorVocales++;
                } else {
                    contadorConsonantes++;
                }
            }
        }

        System.out.println("Número de vocales: " + contadorVocales);
        System.out.println("Número de consonantes: " + contadorConsonantes);

        sc.close();
    }
}
