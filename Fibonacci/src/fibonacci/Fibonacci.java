/*
 * Escribe un programa que escribe los N primeros elementos de la serie de
 * Fibonacci:
 * “1, 1, 2, 3, 5, 8, 13, 21, 34…”
 * F0 = 1
 * F1 = 1
 * FN = FN-1 + FN-2
 * Un término es igual a la suma de los dos anteriores
 * N se lee desde teclado y debe ser un valor mayor que 2
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int números = 0;
        do {
            System.out.print("¿Cuántos números de fibonacci quieres obtener?: ");
            try {
                números = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: debes escribir un número entero");
            }
        } while (números < 2);
        System.out.printf("1 1 ");
        int contador = 2;
        double fibonacci;
        double fibonacci1 = 1;
        double fibonacci2 = 1;
        while (contador < números) {
            fibonacci = fibonacci2 + fibonacci1;
            System.out.printf("%.0f ", fibonacci);
            fibonacci2 = fibonacci1;
            fibonacci1 = fibonacci;
            contador += 1;
        }
        System.out.println("");
    }

}
