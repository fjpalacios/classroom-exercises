/*
 * Escribe un programa que lee un número entero y si queremos ver el número par
 * anterior o posterior al número leído, y visualiza el número par correspondiente.
 */
package númeroparanteriorposterior;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class NúmeroParAnteriorPosterior {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Elige un número entero: ");
        int número = scan.nextInt();
        System.out.print("¿Quieres ver su par anterior o posterior? [ant/post]: ");
        String antPost = scan.next();
        int esPar = 2 - Math.abs(número % 2);
        número = número + (antPost.equalsIgnoreCase("ant") ? -esPar : esPar);
        System.out.printf("El número par que quieres ver es el %d%n", número);
    }

}
