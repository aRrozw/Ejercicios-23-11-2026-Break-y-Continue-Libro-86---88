
import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0;
        double mayor = -1, menor = 21;
        int cantidad = 0;
        int invalidas = 0;

        for (int i = 1; i <= 200; i++) {
            System.out.print("Ingrese nota " + i + ": ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 20) {
                System.out.println("Nota no valida.");
                invalidas++;
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
            System.out.println("Notas validas: " + cantidad);
        } else {
            System.out.println("No hay notas validas.");
        }

        System.out.println("Notas invalidas: " + invalidas);

        sc.close();
    }
}
