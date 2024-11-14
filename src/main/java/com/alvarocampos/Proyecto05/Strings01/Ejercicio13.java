package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio13 {

    public static void menu(){
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("==============");
        System.out.println("1. Palabra mas larga.");
        System.out.println("2. Palabra mas corta.");
        System.out.println("3. Numero de vocales.");
        System.out.println("------------------------------------");
        System.out.println("0. Salir");
    }

    public static void palabraLarga() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera palabra:");
        String palabraUno = sc.nextLine();
        System.out.println("Introduce la segunda palabra:");
        String palabraDos = sc.nextLine();
        System.out.println("Introduce la tercera palabra:");
        String palabraTres = sc.nextLine();

        String palabraLarga = palabraUno;

        if (palabraDos.length() > palabraLarga.length()) {
            palabraLarga = palabraDos;
        }
        if (palabraTres.length() > palabraLarga.length()) {
            palabraLarga = palabraTres;
        }

        System.out.println("La palabra mas larga es: " + palabraLarga);
    }

    public static void palabraMasCorta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera palabra:");
        String palabraUno = sc.nextLine();
        System.out.println("Introduce la segunda palabra:");
        String palabraDos = sc.nextLine();
        System.out.println("Introduce la tercera palabra:");
        String palabraTres = sc.nextLine();

        String palabraCorta = palabraUno;

        if (palabraDos.length() < palabraCorta.length()) {
            palabraCorta = palabraDos;
        }
        if (palabraTres.length() < palabraCorta.length()) {
            palabraCorta = palabraTres;
        }

        System.out.println("La palabra mas corta es: " + palabraCorta);
    }

    public static void contarVocal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon una palabra: ");
        String palabra = sc.nextLine();
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = Character.toLowerCase(palabra.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("La palabra contiene " + contador + " vocales.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            menu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    palabraLarga();
                    break;
                case 2:
                    palabraMasCorta();
                    break;
                case 3:
                    contarVocal();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("No es un numero valido. Dame una opcion que si sea valida.");
            }
        } while (opcion != 0);  //Se cierra
    }
}
