
import java.util.Scanner;

public class Continue18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lluvia, total = 0;
        int cantidad = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese lluvia del dia " + i + " (mm): ");
            lluvia = sc.nextDouble();

            if (lluvia < 0) {
                System.out.println("Registro ignorado.");
                continue;
            }

            total += lluvia;
            cantidad++;
        }

        System.out.println("\nPrecipitacion acumulada: " + total + " mm");

        if (cantidad > 0) {
            System.out.println("Promedio: " + total / cantidad + " mm");
        } else {
            System.out.println("No hay registros validos.");
        }

        sc.close();
    }
}
