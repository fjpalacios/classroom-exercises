/*
 * Escribe un programa que lee un número e indica si es, o no, capicúa.
 */
package capicua;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class Capicua {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int número = 1;
        do {
            try {
                System.out.print("Introduce un número positivo de dos dígitos mínimo: ");
                número = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: introduce un número válido");
            }
        } while (número < 10);
        int copiaNúmero = número;
        int númeroDelRevés = 0;
        while (copiaNúmero > 0) {
            númeroDelRevés = númeroDelRevés * 10 + copiaNúmero % 10;
            copiaNúmero /= 10;
        }
        if (número == númeroDelRevés) {
            System.out.println("Es un número capicúa");
        } else {
            System.out.println("No es un número capicúa");
        }
    }

}
