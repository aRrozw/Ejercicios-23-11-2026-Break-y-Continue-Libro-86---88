
import java.util.Scanner;

public class Ejer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        String ganador = "";
        int puntaje;

        while (true) {
            System.out.print("Nombre del participante: ");
            nombre = sc.nextLine();

            System.out.print("Ingrese su puntaje: ");
            puntaje = sc.nextInt();
            sc.nextLine();

            if (puntaje >= 100) {
                ganador = nombre;
                break;
            }
        }

        System.out.println("\n¡Tenemos un ganador!");
        System.out.println("Ganador: " + ganador);
        System.out.println("Puntaje final: 100 puntos o mas.");

        sc.close();
    }
}
