
import java.util.Scanner;

public class Continue07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correo;

        System.out.println("Ingrese 5 correos:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Correo " + i + ": ");
            correo = sc.nextLine();

            if (!correo.contains("@")) {
                System.out.println("Correo no valido.");
                continue;
            }

            System.out.println("Correo valido: " + correo);
        }

        sc.close();
    }
}
