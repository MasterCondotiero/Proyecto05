package com.alvarocampos.Proyecto05.Arrays01;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio13 {

    /**
     *
     * @param N
     * @return el arrayV
     */
    public static int[] generarArrayV(int N) {
        Random random = new Random();
        int[] arrayV = new int[N];
        for (int i = 0; i < arrayV.length; i++) {
            arrayV[i] = random.nextInt(100);
        }
        return arrayV;
    }

    /**
     *
     * @param arrayV
     * @return un array solo con los pares de arrayV llamado arrayP
     */
    public static int[] crearArrayPares(int[] arrayV) {
        ArrayList<Integer> pares = new ArrayList<>(); // ArrayList para manejar pares

        for (int valor : arrayV) {
            if (valor % 2 == 0) { // Si el número es par se guarda
                pares.add(valor);
            }
        }

        int[] arrayP = new int[pares.size()];
        for (int i = 0; i < pares.size(); i++) {
            arrayP[i] = pares.get(i);
        }
        return arrayP;
    }
    public static void main(String[] args) {
        final int N = 50;
        int[] V = generarArrayV(N);
        int[] P = crearArrayPares(V);

        System.out.println("Array V:");
        for (int i = 0; i < V.length; i++) {
            System.out.println("V[" + i + "] = " + V[i]);
        }

        if (P.length == 0) {
            System.out.println("\nNo hay elementos pares en el array V.");
        } else {
            System.out.println("\nArray P (elementos pares de V):");
            for (int i = 0; i < P.length; i++) {
                System.out.println("P[" + i + "] = " + P[i]);
            }
        }
    }
}
