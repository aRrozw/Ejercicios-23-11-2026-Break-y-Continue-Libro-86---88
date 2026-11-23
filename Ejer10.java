
import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double transferencia;
        int registros = 0;

        while (true) {
            System.out.print("Ingrese el monto de transferencia: S/ ");
            transferencia = sc.nextDouble();

            registros++;

            if (transferencia > 100000) {
                System.out.println("\nTransferencia sospechosa: S/ " +
                        transferencia);
                break;
            }
        }

        System.out.println("Registros procesados: " + registros);
        System.out.println("Analisis bancario detenido.");

        sc.close();
    }
}
