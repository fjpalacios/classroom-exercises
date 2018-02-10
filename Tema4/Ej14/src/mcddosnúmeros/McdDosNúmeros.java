/*
 * Escribe un programa que lee dos números y visualiza el máximo común divisor.
 */
package mcddosnúmeros;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class McdDosNúmeros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int númeroMenor = 0;
        do {
            System.out.print("Introduce un número mayor que 0: ");
            try {
                númeroMenor = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: debes introducir un número entero");
            }
        } while (númeroMenor < 1);
        int númeroMayor = 0;
        do {
            System.out.print("Introduce otro número mayor que 0: ");
            try {
                númeroMayor = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: debes introducir un número entero");
            }
        } while (númeroMayor < 1);
        int mcd = númeroMenor;
        if (númeroMenor > númeroMayor) {
            mcd = númeroMayor;
        }
        while ((númeroMenor % mcd != 0) || (númeroMayor % mcd != 0)) {
            mcd--;
        }
        System.out.printf("El MCD de %d y %d es %d%n", númeroMayor, númeroMenor, mcd);
    }

}
