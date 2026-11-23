
import java.util.Scanner;

public class Continue06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura, suma = 0;
        double mayor = -100, menor = 100;
        int cantidad = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese temperatura: ");
            temperatura = sc.nextDouble();

            if (temperatura < -10 || temperatura > 50) {
                System.out.println("Temperatura ignorada.");
                continue;
            }

            suma += temperatura;
            cantidad++;

            if (temperatura > mayor) mayor = temperatura;
            if (temperatura < menor) menor = temperatura;
        }

        if (cantidad > 0) {
            System.out.println("\nTemperatura promedio: " + suma / cantidad);
            System.out.println("Temperatura maxima: " + mayor);
            System.out.println("Temperatura minima: " + menor);
        } else {
            System.out.println("No hay temperaturas validas.");
        }

        sc.close();
    }
}
