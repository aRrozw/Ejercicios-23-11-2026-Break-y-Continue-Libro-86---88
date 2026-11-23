
import java.util.Scanner;

public class Ejer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double medida;
        int revisadas = 0;

        while (true) {
            System.out.print("Ingrese medida de la pieza (cm): ");
            medida = sc.nextDouble();

            revisadas++;

            if (medida < 10 || medida > 20) {
                System.out.println("\nMedida incorrecta: " + medida + " cm");
                break;
            }
        }

        System.out.println("Piezas revisadas: " + revisadas);
        System.out.println("Control de calidad detenido.");

        sc.close();
    }
}
