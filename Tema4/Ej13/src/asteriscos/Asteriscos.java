/*
 * Escribe un programa que visualiza:
 * ****
 * ***
 * **
 * *
 * El número de * de la primera línea se lee de teclado.
 */
package asteriscos;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class Asteriscos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int asteriscos = 0;
        do {
            System.out.print("¿Cuántos asteriscos quieres escribir?: ");
            try {
                asteriscos = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: tienes que escribir un número entero");
            }
        } while (asteriscos < 1);
        while (asteriscos > 0) {
            for (int i = 0; i < asteriscos; i++) {
                System.out.print("*");
            }
            System.out.println("");
            asteriscos--;
        }
    }

}
