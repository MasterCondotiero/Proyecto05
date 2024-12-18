package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio01 {
    public static String upperCase(String frase) {
        String[] palabra = frase.split("\\S+");        //Tal vez con "a-z"||"A-Z"
        palabra[0] = palabra[0].toUpperCase();

        return String.join(" ", palabra);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean texto = false;

        System.out.println("Pasame la frase que quieras");
        String frase = sc.nextLine();

        while (!texto){
            if (frase.isEmpty() || frase.matches("0-9")){
                texto =false;
                System.out.println("No me has pasado ningun texto.");
                System.out.println("Vuelva a pasarme la frase que quieres, pero ahora escribe algo");
                frase = sc.nextLine();
            } else {
                texto = true;
                System.out.println(upperCase(frase));
            }
        }
        sc.close();
    }
}
