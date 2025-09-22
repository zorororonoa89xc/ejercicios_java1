package ejerciciosenclasePDF_byron_basante;

import java.util.Scanner;

public class ejercicio4 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Ejercicio 4----------");

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = sc.next().charAt(0);

        switch (operacion) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: división por cero");
                }
                break;
            default:
                System.out.println("Operación no válida");
        }
    }
}