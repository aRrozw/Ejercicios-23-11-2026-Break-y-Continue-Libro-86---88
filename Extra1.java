
import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0;
        double mayor = -1, menor = 21;
        int cantidad = 0;
        int aprobados = 0, desaprobados = 0;

        for (int i = 1; i <= 200; i++) {
            System.out.print("Ingrese nota " + i + ": ");
            nota = sc.nextDouble();

            if (nota == 20) {
                break;
            }

            if (nota < 0 || nota > 20) {
                System.out.println("Nota no valida.");
                continue;
            }

            suma += nota;
            cantidad++;

            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;

            if (nota >= 11) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        if (cantidad > 0) {
            System.out.println("\nCantidad de notas validas: " + cantidad);
            System.out.println("Promedio: " + suma / cantidad);
            System.out.println("Nota maxima: " + mayor);
            System.out.println("Nota minima: " + menor);
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Desaprobados: " + desaprobados);
        } else {
            System.out.println("No hay notas validas.");
        }

        sc.close();
    }
}
