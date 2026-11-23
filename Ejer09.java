
import java.util.Scanner;

public class Ejer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respuesta;
        int cantidad = 0;
        int suma = 0;

        while (true) {
            System.out.print("Ingrese satisfaccion (1-5) o 0 para salir: ");
            respuesta = sc.nextInt();

            if (respuesta == 0) {
                break;
            }

            if (respuesta < 1 || respuesta > 5) {
                System.out.println("Respuesta no valida.");
                continue;
            }

            suma += respuesta;
            cantidad++;
        }

        System.out.println("\nTotal de respuestas: " + cantidad);

        if (cantidad > 0) {
            System.out.println("Promedio de satisfaccion: " +
                    (double) suma / cantidad);
        } else {
            System.out.println("No se registraron respuestas.");
        }

        sc.close();
    }
}
