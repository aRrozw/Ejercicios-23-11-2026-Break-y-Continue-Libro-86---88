
import java.util.Scanner;

public class Continue16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, suma = 0, mayor = 0;
        int cantidad = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese salario: S/ ");
            salario = sc.nextDouble();

            if (salario < 0) {
                System.out.println("Salario ignorado.");
                continue;
            }

            suma += salario;
            cantidad++;

            if (salario > mayor) {
                mayor = salario;
            }
        }

        if (cantidad > 0) {
            System.out.println("\nPromedio salarial: S/ " +
                    suma / cantidad);
            System.out.println("Salario mas alto: S/ " + mayor);
        } else {
            System.out.println("No hay salarios validos.");
        }

        sc.close();
    }
}
