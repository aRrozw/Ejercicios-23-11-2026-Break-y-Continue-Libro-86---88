
import java.util.Scanner;
import java.util.Random;

public class Ejer06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(100) + 1;
        int numero, intentos = 0;

        while (true) {
            System.out.print("Adivine el numero (1-100): ");
            numero = sc.nextInt();

            intentos++;

            if (numero == secreto) {
                break;
            } else if (numero < secreto) {
                System.out.println("El numero es mayor.");
            } else {
                System.out.println("El numero es menor.");
            }
        }

        System.out.println("\n¡Felicidades! Adivinaste.");
        System.out.println("Numero secreto: " + secreto);
        System.out.println("Intentos utilizados: " + intentos);

        sc.close();
    }
}
