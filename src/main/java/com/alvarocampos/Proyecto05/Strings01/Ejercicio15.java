package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio15 {
    public static void dibujarRectangulo(int ancho, int alto, char caracter) {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar ancho
        System.out.print("Como de ancho sera rectangulo: ");
        int ancho = sc.nextInt();

        // Solicitar alto
        System.out.print("Cual sera el alto del rectángulo: ");
        int alto = sc.nextInt();

        // Solicitar el caracter
        System.out.print("Introduce el caracter para dibujar el rectangulo: ");
        char caracter = sc.next().charAt(0);  // Lee el primer carácter de la entrada

        // Llamar metodo
        dibujarRectangulo(ancho, alto, caracter);

        sc.close();
    }
}
