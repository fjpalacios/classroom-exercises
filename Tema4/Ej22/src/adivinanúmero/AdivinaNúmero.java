/*
 * Escribe un programa que permite adivinar un número generado de forma
 * aleatoria entre 1000 y 9999. Se lee un número de teclado, y el programa nos
 * indica si es mayor o menor que el que hay que acertar. Finaliza cuando se
 * acierta el número.
 * Sólo hay 10 intentos, para acertar el número.
 */
package adivinanúmero;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class AdivinaNúmero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int númeroAleatorio = (int) (1000 + Math.random() * (9999 - 1000 + 1));
        System.out.println("He generado un número aleatorio…");
        int contador = 9;
        int númeroElegido = númeroEntero(contador, scan);
        while (númeroAleatorio != númeroElegido && contador > 0) {
            if (númeroElegido > númeroAleatorio) {
                System.out.println("Has fallado, el número es menor");
            } else {
                System.out.println("Has fallado, el número es mayor");
            }
            contador--;
            númeroElegido = númeroEntero(contador, scan);
        }
        if (númeroAleatorio != númeroElegido) {
            System.out.printf("Has fallado, el número aleatorio era "
                    + "el %d%n", númeroAleatorio);
        } else {
            System.out.println("Enhorabuena, has acertado el número");
        }
    }

    public static int númeroEntero(int contador, Scanner scan) {
        int númeroEntero = 0;
        boolean esNúmero = true;
        do {
            System.out.printf("Trata de adivinar el número "
                    + "(te quedan %d oportunidades): ", contador + 1);
            try {
                númeroEntero = Integer.parseInt(scan.next());
                esNúmero = true;
            } catch (Exception e) {
                System.out.println("Error: debes escribir un número entero");
                esNúmero = false;
            }
        } while (!esNúmero);
        return númeroEntero;
    }

}
