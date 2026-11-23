
import java.util.Scanner;

public class Continue17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double monto, total = 0;
        int cantidad = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese monto de transaccion: S/ ");
            monto = sc.nextDouble();

            if (monto < 10) {
                System.out.println("Transaccion ignorada.");
                continue;
            }

            total += monto;
            cantidad++;
        }

        System.out.println("\nTotal procesado: S/ " + total);
        System.out.println("Transacciones validas: " + cantidad);

        sc.close();
    }
}
