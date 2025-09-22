package ejerciciosenclasePDF_byron_basante;

import java.util.Scanner;

public class ejercicio11 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor en dólares: ");
        double dolares = scanner.nextDouble();

        double tasaCambio = 3923.50; // valor del dólar en pesos colombianos
        double pesos = tasaCambio * dolares;

        System.out.println(dolares + " USD equivalen a " + pesos + " Pesos Colombianos.");
    }
}
