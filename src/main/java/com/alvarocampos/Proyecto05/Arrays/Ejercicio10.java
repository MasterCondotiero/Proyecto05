package com.alvarocampos.Proyecto05.Arrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        String opcion = "-1";
        do {
            System.out.print("MENU PRINCIPAL\n" +
                    "==============\n" +
                    "1.- Rellena el array P con 10 elementos numericos\n" +
                    "2.- Visualizar contenido del array P\n" +
                    "3.- Visualizar contenido del array S\n" +
                    "0.- Salir del menu");
            opcion = sc.nextLine();
            switch (opcion) {
                /*case "1" -> rellenarArray(arrayP);
                    arrayS = generarArrayS(arrayP);
                case "2" -> visualizarArray(arrayP, "P");
                case "3" -> if (arrayS != null) {
                        visualizarArray(arrayS, "S");
                    } else {
                        System.out.println("El array S no se ha generado. Rellena el array P para que funcione (opcion 1)");
                    }
                    */
                case "0" -> System.out.print("Saliendo...");
                default ->System.out.println("Opcion no valida. Selecciona otra opcion entre 0 y 3.");
            }
        }while (opcion != "0") ;
    }
    public static void main(String[] args) {
        menu();
    }
}

