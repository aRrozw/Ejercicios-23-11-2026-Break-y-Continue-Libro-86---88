
import java.util.Scanner;

public class Continue10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] pagos = new double[10];
        double pago, total = 0;
        int cantidad = 0;
        boolean repetido;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese pago: S/ ");
            pago = sc.nextDouble();

            repetido = false;

            for (int j = 0; j < cantidad; j++) {
                if (pagos[j] == pago) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Pago repetido, ignorado.");
                continue;
            }

            pagos[cantidad] = pago;
            cantidad++;
            total += pago;
        }

        System.out.println("\nTotal acumulado: S/ " + total);
        System.out.println("Pagos unicos: " + cantidad);

        sc.close();
    }
}
