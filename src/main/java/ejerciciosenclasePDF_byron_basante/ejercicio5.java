package ejerciciosenclasePDF_byron_basante;

import java.util.Scanner;

public class ejercicio5 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota (0 - 100): ");
        int nota = sc.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("Calificación: A");
        } else if (nota >= 80) {
            System.out.println("Calificación: B");
        } else if (nota >= 70) {
            System.out.println("Calificación: C");
        } else if (nota >= 60) {
            System.out.println("Calificación: D");
        } else if (nota >= 0) {
            System.out.println("Calificación: F");
        } else {
            System.out.println("Error: la nota debe estar entre 0 y 100");
        }

        System.out.println(); // Línea en blanco para separar
    }
}
