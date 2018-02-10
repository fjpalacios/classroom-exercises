/*
 * Escribe un programa que lee dos números enteros, y presenta los múltiples
 * del valor más pequeño, inferiores al valor más grande.
 */
package númerosmúltiples;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class NúmerosMúltiples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int númeroMenor = 0;
        do {
            System.out.print("Escribe el primer número entero mayor que 0: ");
            númeroMenor = scan.nextInt();
        } while (númeroMenor < 1);
        int númeroMayor = 0;
        do {
            System.out.print("Escribe el segundo número entero mayor que 0: ");
            númeroMayor = scan.nextInt();
        } while (númeroMayor < 1);
        int temporal;
        if (númeroMenor > númeroMayor) {
            temporal = númeroMayor;
            númeroMayor = númeroMenor;
            númeroMenor = temporal;
        }
        temporal = númeroMenor;
        while (temporal < númeroMayor) {
            if (temporal % númeroMenor == 0) {
                System.out.print(temporal + " ");
            }
            temporal = temporal + númeroMenor;
        }
        System.out.println("");
    }

}
