package ejerciciosenclasePDF_byron_basante;

import java.util.Scanner;

public class ejercicio6 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de un mes (1-12): ");
        int mes = sc.nextInt();

        String estacion;

        switch (mes) {
            case 12: case 1: case 2:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido (debe ser entre 1 y 12)";
        }

        System.out.println("Estación: " + estacion);
        System.out.println(); // Línea en blanco
    }
}