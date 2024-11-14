package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio11 {

    public static String todoJunto(String nombre, String primerApellido, String segundoApellido){
        String nombreCompleto = String.join(" ",
                nombre != null ? nombre : "",
                primerApellido != null ? primerApellido : "",
                segundoApellido != null ? segundoApellido : ""
        );
        return nombreCompleto.trim();
    }

    public static String nombreCompletoMayus(String nombreCompleto){
        return nombreCompleto.toUpperCase();
    }

    public static String nombreCompletoMinus(String nombreCompleto){
        return nombreCompleto.toLowerCase();
    }
    public static int contarCaracteres(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++)
        {
            if(Character.isLetter(cadena.charAt(i)))
            {
                contador++;
            }
        }
        return contador;
    }

    public static int contarOcurreciaUltimo(String cadena, String letra){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++)
        {
            if (String.valueOf(cadena.charAt(i)).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public static String truncaPrimero(String resulTodoJunto, int n){
        return resulTodoJunto.substring(0,n);
    }

    public static String truncaUltimo(String resulTodoJunto, int n){
        return resulTodoJunto.substring(resulTodoJunto.length() -n);
    }

    public static String truncaMayus(String resulTodoJunto) {
        for (int i = 0; i < resulTodoJunto.length(); i++) {
            char ch = resulTodoJunto.charAt(i);
            if (Character.isUpperCase(ch)) {
                return String.valueOf(ch);
            }
        }
        return "";
    }

    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int M = 5;
        final int N = 2;
        final int K = 1;

        System.out.println("Pasame tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Pasame tu primer apellido; ");
        String primerApellido = sc.nextLine();
        System.out.println("Pasame tu segundo apellido: ");
        String segundoApellido = sc.nextLine();

        String resulTodoJunto = todoJunto(nombre, primerApellido, segundoApellido);

        String mayus = nombreCompletoMayus(resulTodoJunto);
        String minus = nombreCompletoMinus(resulTodoJunto);
        int cont = contarCaracteres(resulTodoJunto);
        System.out.println(mayus + " con " + cont + " caracteres.");


        if (cont >= M){
            System.out.println("Primeros cinco caracteres: " + truncaPrimero(resulTodoJunto, M));
        }
        if (cont >= N){
            System.out.println("Ultimos dos caracteres: " + truncaUltimo(resulTodoJunto, N));
        }
        if (cont >= K){
            System.out.println("El numero de ocurrencias en la cadena del ultimo caracter que es " + truncaUltimo(resulTodoJunto, K) + " es de " + contarOcurreciaUltimo(resulTodoJunto, truncaUltimo(minus, K)));
            System.out.println("El numero de ocurrencias en la cadena del primer caracter en mayusculas " + truncaMayus(resulTodoJunto) + " es de " + contarOcurreciaUltimo(resulTodoJunto, truncaMayus(resulTodoJunto)));
            System.out.println(invertirCadena(resulTodoJunto));
        }
        System.out.println("***"+resulTodoJunto+"***");
        System.out.println(invertirCadena(resulTodoJunto));
        sc.close();
    }
}
