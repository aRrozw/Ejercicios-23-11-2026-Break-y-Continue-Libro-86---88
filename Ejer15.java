
import java.util.Scanner;

public class Ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String producto;
        int stock;
        int validos = 0;

        while (true) {
            System.out.print("Ingrese nombre del producto: ");
            producto = sc.nextLine();

            System.out.print("Ingrese cantidad de stock: ");
            stock = sc.nextInt();
            sc.nextLine();

            if (stock < 0) {
                System.out.println("\nProducto con error: " + producto);
                break;
            }

            validos++;
        }

        System.out.println("Registros validos: " + validos);
        System.out.println("Verificacion finalizada.");

        sc.close();
    }
}
