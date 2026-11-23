
import java.util.Scanner;

public class Continue13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respuesta;
        int[] frecuencia = new int[6];
        int suma = 0, cantidad = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese respuesta (1-5): ");
            respuesta = sc.nextInt();

            if (respuesta < 1 || respuesta > 5) {
                System.out.println("Respuesta ignorada.");
                continue;
            }

            frecuencia[respuesta]++;
            suma += respuesta;
            cantidad++;
        }

        System.out.println("\nFrecuencia de respuestas:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Respuesta " + i + ": " + frecuencia[i]);
        }

        if (cantidad > 0) {
            System.out.println("Promedio: " + (double) suma / cantidad);
        } else {
            System.out.println("No hay respuestas validas.");
        }

        sc.close();
    }
}
