package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre y apellidos");
        String cadena = sc.nextLine();
        ClaseCadena ClaseCadena = new ClaseCadena();
        String iniciales = ClaseCadena.DevuelveIniciales(cadena);
        System.out.println(iniciales);

    }
}