
import java.util.Scanner;

public class Ejer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroPaquete = 0;
        int validos = 0;
        String estado;

        while (true) {
            numeroPaquete++;

            System.out.print("¿El paquete " + numeroPaquete +
                    " esta corrupto? (SI/NO): ");
            estado = sc.nextLine();

            if (estado.equalsIgnoreCase("SI")) {
                System.out.println("\nPaquete corrupto: " + numeroPaquete);
                break;
            }

            if (estado.equalsIgnoreCase("NO")) {
                validos++;
            } else {
                System.out.println("Respuesta no valida.");
                numeroPaquete--;
            }
        }

        System.out.println("Paquetes validos procesados: " + validos);
        System.out.println("Simulacion de red finalizada.");

        sc.close();
    }
}
