
import java.util.Scanner;

public class Continue03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double venta, total = 0;
        int cantidad = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese venta: S/ ");
            venta = sc.nextDouble();

            if (venta < 0) {
                System.out.println("Venta ignorada.");
                continue;
            }

            total += venta;
            cantidad++;
        }

        System.out.println("\nTotal vendido: S/ " + total);
        System.out.println("Ventas validas: " + cantidad);

        sc.close();
    }
}
