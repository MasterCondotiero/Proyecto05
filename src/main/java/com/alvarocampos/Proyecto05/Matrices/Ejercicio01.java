package com.alvarocampos.Proyecto05.Matrices;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Generar matriz
        System.out.print("Ingrese el numero de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int columnas = scanner.nextInt();

        // Crear matriz
        double[][] matriz = new double[filas][columnas];

        //Valores de la matriz
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextDouble();
            }
        }

        //Mostrar matriz
        System.out.println("\nMatriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%10.4f", matriz[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
