
public class Ejer14 {
    public static void main(String[] args) {

        int numero = 1;

        while (true) {

            if (numero % 17 == 0 && numero % 23 == 0) {
                break;
            }

            numero++;
        }

        System.out.println("Numero encontrado: " + numero);
    }
}
