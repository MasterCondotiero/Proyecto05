package com.alvarocampos.Proyecto05.Arrays;

import java.util.Scanner;

public class Ejercicio10 {

    public static String scanner(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        return input;
    }
    public static String randomArray(){

    }
    public static void menu(){
        int opcion = -1;
        do{
            System.out.print("MENU PRINCIPAL\n"+"==============\n"+"1.- Rellena el array P con 10 elementos numericos\n"+"2.- Visualizar contenido del array P\n"+"3.- Visualizar contenido del array S\n"+"0.- Salir del menu");
            String opcion = scanner();
        } while (opcion !=0);
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        menu();
    }
}
