package ejerciciosenclasePDF_byron_basante;

import java.util.Scanner;

public class ejercicio7 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = sc.nextInt();

        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número inválido. Debe estar entre 1 y 7.";
        }

        System.out.println("El día correspondiente es: " + nombreDia);
    }
}
