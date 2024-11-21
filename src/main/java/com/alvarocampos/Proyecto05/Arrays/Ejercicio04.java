package com.alvarocampos.Proyecto05.Arrays;

import java.util.Random;

public class Ejercicio04 {
    public static double generarNotaAleatoria() {
        Random rand = new Random();
        return 10 * rand.nextDouble();
    }

    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static void main(String[] args) {
        int cantidadNotas = 30;
        double[] notas = new double[cantidadNotas];

        for (int i = 0; i < cantidadNotas; i++) {
            notas[i] = generarNotaAleatoria();
        }

        double mediaTotal = calcularMedia(notas);

        double sumaNotasMayoresIguales5 = 0;
        int contadorNotasMayoresIguales5 = 0;
        for (double nota : notas) {
            if (nota >= 5) {
                sumaNotasMayoresIguales5 += nota;
                contadorNotasMayoresIguales5++;
            }
        }
        double mediaMayoresIguales5 = 0;
        if (contadorNotasMayoresIguales5 > 0) {
            mediaMayoresIguales5 = sumaNotasMayoresIguales5 / contadorNotasMayoresIguales5;
        }

        System.out.println("Media total: " + mediaTotal);
        System.out.println("Media de notas mayores o iguales a 5: " + mediaMayoresIguales5);
    }
}
