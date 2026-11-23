
import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int cantidad = 0;

        while (true) {
            System.out.print("Ingrese un numero (999 para terminar): ");
            numero = sc.nextInt();

            if (numero == 999) {
                break;
            }

            if (numero < 0) {
                System.out.println("Numero negativo ignorado.");
                continue;
            }

            suma += numero;
            cantidad++;

            if (numero > mayor) mayor = numero;
            if (numero < menor) menor = numero;
        }

        if (cantidad > 0) {
            System.out.println("\nCantidad de numeros validos: " + cantidad);
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio: " + (double) suma / cantidad);
            System.out.println("Numero mayor: " + mayor);
            System.out.println("Numero menor: " + menor);
        } else {
            System.out.println("No se ingresaron numeros validos.");
        }

        sc.close();
    }
}
