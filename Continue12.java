
import java.util.Scanner;

public class Continue12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int produccion, total = 0, dias = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Produccion del dia " + i + ": ");
            produccion = sc.nextInt();

            if (produccion == 0) {
                System.out.println("Dia ignorado.");
                continue;
            }

            total += produccion;
            dias++;
        }

        System.out.println("\nProduccion acumulada: " + total);

        if (dias > 0) {
            System.out.println("Promedio diario: " + (double) total / dias);
        } else {
            System.out.println("No hubo produccion.");
        }

        sc.close();
    }
}
