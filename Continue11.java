
import java.util.Scanner;

public class Continue11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String producto;
        int stock, total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese producto: ");
            producto = sc.nextLine();

            System.out.print("Ingrese stock: ");
            stock = sc.nextInt();
            sc.nextLine();

            if (stock == 0) {
                System.out.println("Producto sin stock, ignorado.");
                continue;
            }

            if (stock < 0) {
                System.out.println("Stock no valido.");
                continue;
            }

            total += stock;
        }

        System.out.println("\nTotal de unidades disponibles: " + total);

        sc.close();
    }
}
