
import java.util.Scanner;

public class Ejer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroPedido;
        String tipo;
        int procesados = 0;

        while (true) {
            System.out.print("Ingrese numero de pedido: ");
            numeroPedido = sc.nextInt();
            sc.nextLine();

            System.out.print("¿Es urgente? (SI/NO): ");
            tipo = sc.nextLine();

            procesados++;

            if (tipo.equalsIgnoreCase("SI")) {
                System.out.println("\nPedido urgente: " + numeroPedido);
                break;
            }
        }

        System.out.println("Pedidos procesados: " + procesados);
        System.out.println("Proceso de pedidos detenido.");

        sc.close();
    }
}
