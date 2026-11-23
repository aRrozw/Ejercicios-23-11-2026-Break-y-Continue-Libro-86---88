
public class Continue19 {
    public static void main(String[] args) {

        int cantidad = 0;

        System.out.println("Numeros validos del 1 al 500:");

        for (int i = 1; i <= 500; i++) {

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            }

            System.out.println(i);
            cantidad++;
        }

        System.out.println("\nCantidad encontrada: " + cantidad);
    }
}
