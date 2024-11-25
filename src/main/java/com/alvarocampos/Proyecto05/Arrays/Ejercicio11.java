package com.alvarocampos.Proyecto05.Arrays;

import java.util.Random;

public class Ejercicio11 {
    public static int[] arrayP(int N) {
        Random random = new Random();
        int[] arrayP = new int[N];
        for (int i = 0; i < arrayP.length; i++) {
            arrayP[i] = random.nextInt(20);
        }
        return arrayP;
    }
    public static int[] arrayV(int[] arrayP) {
        int[] arrayV = new int[arrayP.length];
        for (int i=0, j=arrayP.length-1; i<arrayP.length; i++, j--) {
            arrayV[j] = arrayP[i];
        }
        return arrayV;
    }
    public static void main(String[] args) {
        final int N =10;
        int[] P;
        int[] V;
        P = arrayP(N);
        V = arrayV(arrayP(N));
        System.out.println("Array P: ");
        for (int i = 0; i < N; i++) {
            System.out.println(P[i]);
        }
        System.out.println("\nArray V: ");
        for (int i = 0; i < N; i++) {
            System.out.println(V[i]);
        }
    }
}
