
import java.util.Scanner;

public class Continue09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra;
        int cantidad = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese una palabra: ");
            palabra = sc.nextLine();

            if (palabra.length() < 5) {
                System.out.println("Palabra ignorada.");
                continue;
            }

            cantidad++;
            System.out.println("Palabra valida: " + palabra);
        }

        System.out.println("\nCantidad de palabras validas: " + cantidad);

        sc.close();
    }
}
