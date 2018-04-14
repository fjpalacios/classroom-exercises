/*
 * Escribe un programa que lee un número y nos dice si es primo (divisible
 * únicamente por él mismo y por 1, es suficiente recorrer desde 2 hasta n/2+1).
 * Si no es primo presenta el divisor más pequeño. Repite el proceso hasta
 * introducir un 0.
 */
package númeroprimo;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class NúmeroPrimo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int núm = 0;
        do {
            System.out.print("Escribe un número positivo ó 0 para salir: ");
            try {
                núm = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: introduce un número válido");
            }
        } while (núm < 0);
        while (núm > 0) {
            int divisor = 0;
            for (int contador = núm; contador >= 2; contador--) {
                if (núm % contador == 0) {
                    divisor = contador;
                }
            }
            if (divisor == 0 || divisor == núm) {
                System.out.printf("El %d es un número primo%n", núm);
            } else {
                System.out.printf("El %d no es un número primo, "
                        + "su divisor más pequeño es el %d%n", núm, divisor);
            }
            do {
                System.out.print("Escribe un número positivo ó 0 para salir: ");
                try {
                    núm = Integer.parseInt(scan.next());
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Error: introduce un número válido");
                }
            } while (núm < 0);
        }
    }

}
