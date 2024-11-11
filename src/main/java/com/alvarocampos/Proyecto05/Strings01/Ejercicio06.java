package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multi;
        String frase;

        System.out.println("Introduce una frase");
        frase = sc.nextLine();
        System.out.println("Introduce la cantidad de veces que se muestre");
        multi = Integer.parseInt(sc.nextLine()) ;

        for (int i=0; i<multi; i++) {
            System.out.println(frase);
        }

    }
}
