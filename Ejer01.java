
import java.util.Scanner;

public class Ejer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0;
        double mayor = -1, menor = 21;
        int cantidad = 0;

        while (true) {
            System.out.print("Ingrese una nota: ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 20) {
                System.out.println("Nota no valida.");
                continue;
            }

            cantidad++;
            suma += nota;

            if (nota > mayor) {
                mayor = nota;
            }

            if (nota < menor) {
                menor = nota;
            }

            if (nota == 20) {
                break;
            }
        }

        System.out.println("\nCantidad de notas: " + cantidad);
        System.out.println("Promedio: " + (suma / cantidad));
        System.out.println("Nota maxima: " + mayor);
        System.out.println("Nota minima: " + menor);

        sc.close();
    }
}
