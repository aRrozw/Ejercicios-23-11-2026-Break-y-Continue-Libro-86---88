
import java.util.Scanner;

public class Ejer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int operaciones = 0;

        do {
            System.out.println("\n--- CAJERO AUTOMATICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 4) {
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es S/ 1500");
                    operaciones++;
                    break;

                case 2:
                    System.out.println("Retiro realizado.");
                    operaciones++;
                    break;

                case 3:
                    System.out.println("Deposito realizado.");
                    operaciones++;
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (true);

        System.out.println("\nOperaciones realizadas: " + operaciones);
        System.out.println("Sesion cerrada correctamente.");

        sc.close();
    }
}
