
import java.util.Scanner;

public class Continue15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String respuesta;
        String[] correctas = {"A", "B", "C", "D", "A"};

        int validas = 0;
        int aciertos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Respuesta de la pregunta " +
                    (i + 1) + ": ");
            respuesta = sc.nextLine().trim();

            if (respuesta.isEmpty()) {
                System.out.println("Pregunta sin responder.");
                continue;
            }

            validas++;

            if (respuesta.equalsIgnoreCase(correctas[i])) {
                aciertos++;
            }
        }

        System.out.println("\nRespuestas validas: " + validas);

        if (validas > 0) {
            double porcentaje = (double) aciertos / validas * 100;

            System.out.println("Aciertos: " + aciertos);
            System.out.println("Porcentaje de aciertos: " + porcentaje + "%");
        } else {
            System.out.println("No hay respuestas validas.");
        }

        sc.close();
    }
}
