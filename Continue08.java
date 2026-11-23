
import java.util.Scanner;

public class Continue08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double velocidad, suma = 0, mayor = 0;
        int cantidad = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese velocidad: ");
            velocidad = sc.nextDouble();

            if (velocidad < 20) {
                System.out.println("Velocidad ignorada.");
                continue;
            }

            suma += velocidad;
            cantidad++;

            if (velocidad > mayor) {
                mayor = velocidad;
            }
        }

        if (cantidad > 0) {
            System.out.println("\nVelocidad promedio: " + suma / cantidad);
            System.out.println("Mayor velocidad: " + mayor);
        } else {
            System.out.println("No hay velocidades validas.");
        }

        sc.close();
    }
}
