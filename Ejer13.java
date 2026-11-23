

import java.util.Scanner;

public class Ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int venta;
        int total = 0;
        int cantidad = 0;

        while (true) {
            System.out.print("Ingrese entradas vendidas: ");
            venta = sc.nextInt();

            if (venta <= 0) {
                System.out.println("Cantidad no valida.");
                continue;
            }

            total += venta;
            cantidad++;

            if (total >= 500) {
                break;
            }
        }

        System.out.println("\nTotal vendido: " + total);
        System.out.println("Numero de ventas realizadas: " + cantidad);
        System.out.println("Meta alcanzada.");

        sc.close();
    }
}
