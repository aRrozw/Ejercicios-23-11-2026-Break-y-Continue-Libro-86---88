
import java.util.Scanner;

public class Ejer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int asistentes = 0;

        while (true) {
            System.out.print("Ingrese nombre del estudiante (FIN para terminar): ");
            nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }

            if (nombre.trim().isEmpty()) {
                continue;
            }

            asistentes++;
        }

        System.out.println("\nTotal de asistentes registrados: " + asistentes);

        sc.close();
    }
}
