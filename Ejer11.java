
import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiempo;
        int registros = 0;

        while (true) {
            System.out.print("Ingrese tiempo de respuesta (ms): ");
            tiempo = sc.nextInt();

            registros++;

            if (tiempo > 5000) {
                System.out.println("\nTiempo critico: " + tiempo + " ms");
                break;
            }
        }

        System.out.println("Registros procesados: " + registros);
        System.out.println("Monitoreo detenido.");

        sc.close();
    }
}
