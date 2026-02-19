
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra;
        int vocales = 0;
        int consonantes = 0;

        System.out.print("Ingrese una palabra: ");
        palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
    }
}
