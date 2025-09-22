package ejerciciosenclasePDF_byron_basante;

import java.util.Scanner;

public class ejercicio9 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ MENÚ DE CONVERSIÓN ------");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Kilómetros a Millas");
        System.out.println("4. Millas a Kilómetros");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la temperatura en Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F");
                break;
            case 2:
                System.out.print("Ingrese la temperatura en Fahrenheit: ");
                double fahr = sc.nextDouble();
                double cels = (fahr - 32) * 5 / 9;
                System.out.println(fahr + " °F equivalen a " + cels + " °C");
                break;
            case 3:
                System.out.print("Ingrese la distancia en Kilómetros: ");
                double km = sc.nextDouble();
                double millas = km * 0.621371;
                System.out.println(km + " km equivalen a " + millas + " millas");
                break;
            case 4:
                System.out.print("Ingrese la distancia en Millas: ");
                double mi = sc.nextDouble();
                double kms = mi / 0.621371;
                System.out.println(mi + " millas equivalen a " + kms + " km");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
