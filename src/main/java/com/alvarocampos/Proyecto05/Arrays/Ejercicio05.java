package com.alvarocampos.Proyecto05.Arrays;

import java.util.Scanner;

public class Ejercicio05 {
    public static double calcularMedia(double[] estaturas) {
        double suma = 0;
        for (double estatura : estaturas) {
            suma += estatura;
        }
        return suma / estaturas.length;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int N = scanner.nextInt();
        double[] estaturas = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la estatura de la persona " + (i + 1) + ": ");
            estaturas[i] = scanner.nextDouble();
        }

        double media = calcularMedia(estaturas);
        int contadorSuperioresAMedia = 0;

        for (double estatura : estaturas) {
            if (estatura > media) {
                contadorSuperioresAMedia++;
            }
        }

        System.out.println("La media de las estaturas es: " + media);
        System.out.println("Número de personas con estatura superior a la media: " + contadorSuperioresAMedia);

        scanner.close();
    }
}
