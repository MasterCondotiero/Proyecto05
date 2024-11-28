package com.alvarocampos.Proyecto05.Arrays01;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int opcion;

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("==============");
            System.out.println("1.- Rellena el array");
            System.out.println("2.- Visualizar contenido del array");
            System.out.println("3.- Visualizar contenido par");
            System.out.println("4.- Visualizar contenido múltiplo de 3");
            System.out.println("0.- Salir del menu");
            System.out.print("Selecciona una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> crearArray(array);
                case 2 -> visualizarArray(array);
                case 3 -> visualizarPares(array);
                case 4 -> visualizarMultiplos3(array);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion no valida, selecciona una opcion valida");
            }
        } while (opcion != 0);

        sc.close();
    }

    public static void crearArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51);
        }
        System.out.println("Array creado con exito.");
    }

    public static void visualizarArray(int[] array) {
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion " + i + ": " + array[i]);
        }
    }

    public static void visualizarPares(int[] array) {
        System.out.println("Contenido par del array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Posicion " + i + ": " + array[i]);
            }
        }
    }

    public static void visualizarMultiplos3(int[] array) {
        System.out.println("Contenido múltiplo de 3 del array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("Posicion " + i + ": " + array[i]);
            }
        }
    }
}
