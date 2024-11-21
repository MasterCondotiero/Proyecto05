package com.alvarocampos.Proyecto05.Arrays;

import java.util.Scanner;

public class Ejercicio08 {

    public static int numeroArray(String[] cadena, String numeroVeri) {
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i].equals(numeroVeri)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamanyo del array:");
        int n = Integer.parseInt(sc.nextLine());
        String[] cadena = new String[n];

        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            cadena[i] = sc.nextLine();
        }

        System.out.print("Introduce el numero que buscas en el array: ");
        String numeroVeri = sc.nextLine();

        if (numeroVeri.matches("\\d+")) { // Verifica si es un número
            int posicion = numeroArray(cadena, numeroVeri);
            if (posicion != -1) {
                System.out.println("El valor '" + numeroVeri + "' esta en el array en la posicion " + posicion + ".");
            } else {
                System.out.println("El valor '" + numeroVeri + "' no esta en el array.");
            }
        } else {
            System.out.println("El valor introducido no es un numero valido.");
        }

        sc.close();
    }
}
