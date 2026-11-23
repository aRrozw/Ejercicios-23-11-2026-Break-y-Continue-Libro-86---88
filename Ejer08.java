
public class Ejer08 {
    public static void main(String[] args) {

        String[] codigos = {
            "XYZ100", "ABC200", "DEF300",
            "ABC123", "GHI400", "JKL500"
        };

        String buscado = "ABC123";
        int revisados = 0;
        int posicion = -1;

        for (int i = 0; i < codigos.length; i++) {
            revisados++;

            if (codigos[i].equals(buscado)) {
                posicion = i + 1;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("Codigo encontrado: " + buscado);
            System.out.println("Posicion: " + posicion);
        } else {
            System.out.println("Codigo no encontrado.");
        }

        System.out.println("Codigos revisados: " + revisados);
    }
}
