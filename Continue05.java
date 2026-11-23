
import java.util.Scanner;

public class Continue05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        System.out.println("Vocales encontradas:");

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if ("aeiou".indexOf(letra) == -1) {
                continue;
            }

            System.out.println(letra);
        }

        sc.close();
    }
}
