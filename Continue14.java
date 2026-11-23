
import java.util.Scanner;

public class Continue14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, estado;
        int asistentes = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Nombre del estudiante: ");
            nombre = sc.nextLine();

            System.out.print("Estado (PRESENTE/RETIRADO): ");
            estado = sc.nextLine();

            if (estado.equalsIgnoreCase("RETIRADO")) {
                System.out.println("Estudiante ignorado.");
                continue;
            }

            if (!estado.equalsIgnoreCase("PRESENTE")) {
                System.out.println("Estado no valido.");
                continue;
            }

            asistentes++;
        }

        System.out.println("\nAsistentes validos: " + asistentes);

        sc.close();
    }
}
