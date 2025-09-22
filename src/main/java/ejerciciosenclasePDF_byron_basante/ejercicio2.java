package ejerciciosenclasePDF_byron_basante;

import java.util.Scanner;

public class ejercicio2 {

    public static void ejecutar() {
        float numero1 = 0;
        float numero2 = 0;
        float numero3 = 0;

        System.out.println("----------Ejercicio 2----------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        numero1 = sc.nextFloat();

        System.out.println("Ingrese el segundo numero");
        numero2 = sc.nextFloat();

        System.out.println("Ingrese el tercer numero");
        numero3 = sc.nextFloat();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El " + numero1 + " es el numero Mayor");
        } else {
            if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("El " + numero2 + " es el numero Mayor");
            }
            else  {
                System.out.println("El " + numero3 + " es el numero Mayor");
            }
        }
    }
}