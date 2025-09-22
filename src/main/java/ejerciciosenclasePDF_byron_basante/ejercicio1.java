package ejerciciosenclasePDF_byron_basante;

import java.util.Scanner;

public class ejercicio1 {

    public static void ejecutar() {
        float numero = 0;

        System.out.println("----------Ejercicio 1----------");

        System.out.println("Ingrese un numero");

        Scanner sc = new Scanner(System.in);
        numero = sc.nextFloat();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par");
        } else {
            System.out.println(numero + " es un numero impar");
        }
    }
}