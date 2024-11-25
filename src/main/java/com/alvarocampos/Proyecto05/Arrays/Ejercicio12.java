package com.alvarocampos.Proyecto05.Arrays;

import java.util.Random;

public class Ejercicio12 {

    /**
     *
     * @param N
     * @return
     */
    public static int[] arrayV(int N) {
        Random random = new Random();
        int[] arrayV = new int[N];
        for (int i = 0; i < arrayV.length; i++) {
            arrayV[i] = random.nextInt(10);
        }
        return arrayV;
    }

    /**
     *
     * @param arrayV
     * @return
     */
    public static int[] arrayP(int[] arrayV) {
        int[] arrayP = new int[arrayV.length];
        arrayP[0] = arrayV[0];
        for (int i=1; i<arrayV.length; i++) {
            arrayP[i] = arrayP[i - 1] + arrayV[i];
        }
        return arrayP;
    }

    public static void main(String[] args) {
        final int N =50;
        int[] V = arrayV(N);
        int[] P = arrayP(arrayV(N));

        System.out.println("\nArray V: ");
        for (int i = 0; i < N; i++) {
            System.out.println(V[i]);
        }
        System.out.println("Array P: ");
        for (int i = 0; i < N; i++) {
            System.out.println(P[i]);
        }
    }
}
