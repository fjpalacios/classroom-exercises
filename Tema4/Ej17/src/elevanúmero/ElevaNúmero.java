/*
 * Escribe un programa que eleva un número a un exponente num^ex,
 * num y ex se leen de teclado. num y ex son números en enteros.
 * Elevar un número se calcula de la forma siguiente:
 * n^0 = 1
 * n^ex = n*n*n*n*n*n tantos productos como valga ex
 * n^ex = 1 / (n*n*n*n*n*n) si ex es negativo
 */
package elevanúmero;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class ElevaNúmero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String integer;
        do {
            System.out.print("Introduce un número entero: ");
            integer = scan.next();
        } while (!isInteger(integer));
        int número = Integer.parseInt(integer);
        do {
            System.out.print("Introduce un exponente: ");
            integer = scan.next();
        } while (!isInteger(integer));
        int exponente = Integer.parseInt(integer);
        if (exponente == 0) {
            System.out.printf("%d elevado a %d es 1%n", número, exponente);
        } else {
            System.out.printf("%d elevado a %d es ", número, exponente);
            boolean exponenteNegativo = false;
            if (exponente < 0) {
                exponente = -exponente;
                exponenteNegativo = true;
            }
            double númeroElevado = 1;
            while (exponente > 0) {
                númeroElevado *= número;
                exponente--;
            }
            if (exponenteNegativo) {
                System.out.printf("%.3f%n", 1 / númeroElevado);
            } else {
                System.out.printf("%.0f%n", númeroElevado);
            }
        }
    }

    private static boolean isInteger(String integer) {
        try {
            Integer.parseInt(integer);
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

}
