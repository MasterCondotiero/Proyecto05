package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio03 {

    public static int contarPalabras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }

        String[] palabras = texto.split(" ");
        return palabras.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto que quieras");
        String texto = sc.nextLine();

        int numeroDePalabras = contarPalabras(texto);
        System.out.println("El número de palabras es: " + numeroDePalabras);
    }
}
