package com.alvarocampos.Proyecto05.Strings01;

import java.util.Scanner;

public class Ejercicio14 {

    public static void contador(int num, char car){
        StringBuilder sb = new StringBuilder();
        for (int primero = 0; primero <= 9; primero++) {
            for (int segundo = 0; segundo <= 9; segundo++) {
                for (int tercero = 0; tercero <= 9; tercero++) {
                    for (int cuarto = 0; cuarto <= 9; cuarto++) {
                        sb.append(primero).append("|").append(segundo).append("|").append(tercero).append("|").append(cuarto).append("|");
                        System.out.printf("%s\n", sb.toString().replace(String.valueOf(num),String.valueOf(car)));
                        sb.setLength(0);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que numero quieres sustituir [0-9]");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("Con que letra lo quieres sustituir");
        char car = sc.next().charAt(0);
        contador(num, car);
    }
}
