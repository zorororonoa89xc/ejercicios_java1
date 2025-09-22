package ejerciciosenclasePDF_byron_basante;

import java.util.Scanner;

public class ejercicio10 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000; // saldo inicial
        int opcion;

        do {
            System.out.println("------ CAJERO AUTOMÁTICO ------");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else if (retiro <= 0) {
                        System.out.println("Cantidad inválida.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = sc.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Cantidad inválida.");
                    } else {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Su nuevo saldo es: $" + saldo);
                    }
                    break;

                case 0:
                    System.out.println("Gracias por usar el cajero. ¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println();

        } while (opcion != 0);
    }
}
