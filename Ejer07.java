
import java.util.Scanner;

public class Ejer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int produccion;
        int total = 0;
        int horas = 0;

        while (true) {
            System.out.print("Produccion de la hora: ");
            produccion = sc.nextInt();

            if (produccion == 0) {
                break;
            }

            total += produccion;
            horas++;
        }

        System.out.println("\nTotal producido: " + total);
        System.out.println("Horas registradas: " + horas);

        sc.close();
    }
}
