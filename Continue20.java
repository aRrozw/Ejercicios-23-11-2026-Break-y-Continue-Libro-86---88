
import java.util.Scanner;

public class Continue20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, correo, telefono;
        int validos = 0;
        int total = 10;

        for (int i = 1; i <= total; i++) {
            System.out.println("\nCliente " + i);

            System.out.print("Ingrese nombre: ");
            nombre = sc.nextLine();

            System.out.print("Ingrese correo: ");
            correo = sc.nextLine();

            System.out.print("Ingrese telefono: ");
            telefono = sc.nextLine();

            if (nombre.trim().isEmpty() ||
                correo.trim().isEmpty() ||
                telefono.trim().isEmpty()) {

                System.out.println("Datos incompletos. Cliente ignorado.");
                continue;
            }

            validos++;
            System.out.println("Cliente registrado correctamente.");
        }

        double porcentaje = (double) validos / total * 100;

        System.out.println("\nClientes validos: " + validos);
        System.out.println("Porcentaje de registros validos: " +
                porcentaje + "%");

        sc.close();
    }
}
