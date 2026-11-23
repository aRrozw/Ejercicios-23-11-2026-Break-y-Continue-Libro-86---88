
import java.util.Scanner;

public class Continue02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad, cantidad = 0, suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese edad: ");
            edad = sc.nextInt();

            if (edad < 18 || edad > 65) {
                System.out.println("Edad no valida.");
                continue;
            }

            suma += edad;
            cantidad++;
        }

        System.out.println("\nPersonas validas: " + cantidad);

        if (cantidad > 0) {
            System.out.println("Promedio de edad: " +
                    (double) suma / cantidad);
        } else {
            System.out.println("No hay edades validas.");
        }

        sc.close();
    }
}
