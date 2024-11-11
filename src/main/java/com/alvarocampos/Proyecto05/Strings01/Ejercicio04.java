package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio04 {

    public static String frase (String frase){
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        String[] palabras = frase.split("\\S+");
        for (int i = 0; i < palabras.length; i++) {
            char caracter = frase.charAt(i);

            if (Character.isLetter(caracter)) {
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    contadorVocales++;
                    return ("Número de vocales " + palabras[i] + ": " + contadorVocales);
                } else {
                    contadorConsonantes++;
                    return ("Número de consonantes en la palabra " + palabras[i] + ": " + contadorConsonantes);
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean logica = false;

        System.out.println("Pasame la frase que quieras");
        String frase = sc.nextLine();

        while (!logica){
            if (frase.isEmpty() || frase.matches("0-9") || frase.matches("\\S+")){
                logica =false;
                System.out.println("No me has pasado nada valido.");
                System.out.println("Vuelva a pasarme la frase que quieres, pero ahora escribe algo");
                frase = sc.nextLine();
            } else {
                logica = true;
                System.out.println(frase(frase));
            }
        }
        sc.close();
    }
}
