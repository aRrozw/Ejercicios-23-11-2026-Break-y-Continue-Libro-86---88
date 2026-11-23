
import java.util.Scanner;

public class Ejer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura;
        int lecturas = 0;

        while (true) {
            System.out.print("Ingrese la temperatura: ");
            temperatura = sc.nextDouble();

            lecturas++;

            if (temperatura > 95) {
                System.out.println("\nTemperatura critica: " + temperatura + " °C");
                break;
            }
        }

        System.out.println("Lecturas realizadas: " + lecturas);
        System.out.println("Monitoreo detenido.");

        sc.close();
    }
}
