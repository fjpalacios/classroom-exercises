/*
 * Escribe un programa que lee de teclado una cantidad expresada en pesetas
 * y la transforma a euros.
 */
package depesetasaeuros;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class DePesetasAEuros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("¿Cuántas pesetas quieres convertir a euros?: ");
        double pesetas = scan.nextDouble();
        double euros = pesetas / 166.386;
        System.out.printf("%f pesetas son %.2f euros%n", pesetas, euros);
    }

}
