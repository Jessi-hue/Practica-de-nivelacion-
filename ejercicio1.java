
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int opcion;
        double resultado = 0;

        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextDouble();

        System.out.println("Seleccione una opcion:");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        opcion = sc.nextInt();

        if (opcion == 1) {
            resultado = num1 + num2;
        } else if (opcion == 2) {
            resultado = num1 - num2;
        } else if (opcion == 3) {
            resultado = num1 * num2;
        } else if (opcion == 4) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("No se puede dividir por cero");
                return;
            }
        } else {
            System.out.println("Opcion invalida");
            return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
