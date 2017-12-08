/*
 * Escribe un programa que lee números hasta introducir un cero, y nos pregunta
 * si queremos ver el menor o el mayor, y visualiza el menor o el mayor en
 * función de la respuesta.
 */
package númeromenormayorloop;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class NúmeroMenorMayorLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número (0 termina el programa): ");
        double númeroIntroducido = scan.nextDouble();
        double númeroMenor = númeroIntroducido;
        double númeroMayor = númeroIntroducido;
        while (númeroIntroducido != 0) {
            if (númeroIntroducido < númeroMenor) {
                númeroMenor = númeroIntroducido;
            }
            if (númeroIntroducido > númeroMayor) {
                númeroMayor = númeroIntroducido;
            }
            System.out.print("Introduce un número (0 termina el programa): ");
            númeroIntroducido = scan.nextDouble();
        }
        System.out.print("¿Quieres ver cuál es el número mayor o menor? [+/-]: ");
        String mayorMenor = scan.next();
        if ("+".equals(mayorMenor)) {
            System.out.printf("El número mayor es el %.1f%n", númeroMayor);
        } else {
            System.out.printf("El número menor es el %.1f%n", númeroMenor);
        }
    }

}
