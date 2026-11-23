
import java.util.Scanner;

public class Ejer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double monto;
        int operaciones = 0;

        while (true) {
            System.out.print("Ingrese monto de la operacion: S/ ");
            monto = sc.nextDouble();

            operaciones++;

            if (monto > 50000) {
                System.out.println("\nOperacion sospechosa: S/ " + monto);
                break;
            }
        }

        System.out.println("Operaciones revisadas: " + operaciones);
        System.out.println("Analisis finalizado.");

        sc.close();
    }
}
