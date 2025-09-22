package ejerciciosenclasePDF_byron_basante;

import java.util.Scanner;

public class ejercicio3 {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------Ejercicio 3----------");

        System.out.print("Ingrese su edad: ");

        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Clasificación: Niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Clasificación: Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Clasificación: Adulto");
        } else if (edad >= 60) {
            System.out.println("Clasificación: Adulto mayor");
        } else {
            System.out.println("Edad no válida");
        }
    }
}

