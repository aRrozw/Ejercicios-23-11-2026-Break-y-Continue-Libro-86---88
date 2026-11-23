
import java.util.Scanner;

public class Ejer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, divisor = 0;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero > 1) {
            for (int i = 2; i <= numero / i; i++) {
                if (numero % i == 0) {
                    divisor = i;
                    break;
                }
            }
        }

        if (numero > 1 && divisor == 0) {
            System.out.println("El numero es primo.");
            System.out.println("No se encontro divisor.");
        } else {
            System.out.println("El numero no es primo.");

            if (numero > 1) {
                System.out.println("Primer divisor encontrado: " + divisor);
            } else {
                System.out.println("No tiene divisores primos.");
            }
        }

        sc.close();
    }
}
