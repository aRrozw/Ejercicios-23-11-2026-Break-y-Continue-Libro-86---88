
import java.util.Scanner;

public class Continue01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0;
        double mayor = -1, menor = 21;
        int cantidad = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("Ingrese nota " + i + ": ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 20) {
                System.out.println("Nota no valida.");
                continue;
            }

            suma += nota;
            cantidad++;

            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;
        }

        if (cantidad > 0) {
            System.out.println("\nPromedio: " + suma / cantidad);
            System.out.println("Nota maxima: " + mayor);
            System.out.println("Nota minima: " + menor);
        } else {
            System.out.println("No hay notas validas.");
        }

        sc.close();
    }
}
