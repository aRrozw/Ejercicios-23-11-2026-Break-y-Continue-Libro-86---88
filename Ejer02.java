
import java.util.Scanner;

public class Ejer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String claveCorrecta = "12345";
        String clave;
        boolean acceso = false;
        int intento = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese su contraseña: ");
            clave = sc.nextLine();

            intento = i;

            if (clave.equals(claveCorrecta)) {
                acceso = true;
                break;
            }

            System.out.println("Contraseña incorrecta.");
        }

        if (acceso) {
            System.out.println("Acceso concedido.");
            System.out.println("Accedio en el intento: " + intento);
        } else {
            System.out.println("Acceso denegado.");
        }

        sc.close();
    }
}
