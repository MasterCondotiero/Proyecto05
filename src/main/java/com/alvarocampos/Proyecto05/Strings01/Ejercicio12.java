package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio12 {
    public static String reemplazarEs(String texto) {
        return texto.replaceAll("es", "no por");
    }

    public static String reemplazarDigitos(String texto) {
        return texto.replaceAll("\\d+", "*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasate una frasecita con numeritos y palabritas");
        String texto = sc.nextLine();

        String resultado1 = reemplazarEs(texto);
        System.out.println("Resultado del primer método: " + resultado1);

        String resultado2 = reemplazarDigitos(texto);
        System.out.println("Resultado del segundo método: " + resultado2);
        sc.close();
    }
}
