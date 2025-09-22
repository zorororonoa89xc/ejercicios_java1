package ejerciciosenclasePDF;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---------- MENÚ ----------");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1.ejecutar();
                    break;
                case 2:
                    ejercicio2.ejecutar();
                    break;
                case 3:
                    ejercicio3.ejecutar();
                    break;
                case 4:
                    ejercicio4.ejecutar();
                    break;
                case 5:
                    ejercicio5.ejecutar();
                    break;
                case 6:
                    ejercicio6.ejecutar();
                    break;
                case 7:
                    ejercicio7.ejecutar();
                    break;
                case 8:
                    ejercicio8.ejecutar();
                    break;
                case 9:
                    ejercicio9.ejecutar();
                    break;
                case 10:
                    ejercicio10.ejecutar();
                    break;
                case 11:
                    ejercicio11.ejecutar();
                    break;
                case 12:
                    ejercicio12.ejecutar();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            System.out.println();
        } while (opcion != 0);

        sc.close();

    }

}
