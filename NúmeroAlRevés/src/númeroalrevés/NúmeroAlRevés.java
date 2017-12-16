/*
 * Escribe un programa que lee un número entero mayor que 100000 y escribe las
 * cifras que lo componen al revés (p.e. 125073 --> 370521).
 * Repetirlo hasta entrar un cero
 */
package númeroalrevés;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class NúmeroAlRevés {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int número = 1;
        do {
            try {
                System.out.print("Introduce un número mayor que 10000 ó 0 para salir: ");
                número = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: introduce un número válido");
            }
        } while (número < 10000 && número != 0);
        int copiaNúmero = número;
        while (número != 0) {
            while (copiaNúmero > 0) {
                System.out.print(copiaNúmero % 10);
                copiaNúmero /= 10;
            }
            System.out.println("");
            do {
                try {
                    System.out.print("Introduce un número mayor que 10000 ó 0 para salir: ");
                    número = Integer.parseInt(scan.next());
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Error: introduce un número válido");
                }
            } while (número < 10000 && número != 0);
        }
    }

}
