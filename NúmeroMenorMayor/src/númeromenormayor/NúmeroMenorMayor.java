/*
 * Escribe un programa que lee tres números y pregunta si queremos ver el menor
 * o el mayor, y visualiza el menor o el mayor en función de la respuesta.
 */
package númeromenormayor;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class NúmeroMenorMayor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        int número1 = scan.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int número2 = scan.nextInt();
        int númeroMenor;
        int númeroMayor;
        if (número1 > número2) {
            númeroMayor = número1;
            númeroMenor = número2;
        } else {
            númeroMayor = número2;
            númeroMenor = número1;
        }
        System.out.print("Introduce el tercer número entero: ");
        int número3 = scan.nextInt();
        if (número3 > númeroMayor) {
            númeroMayor = número3;
        }
        if (número3 < númeroMenor) {
            númeroMenor = número3;
        }
        System.out.print("¿Quieres ver el número mayor o el menor? [mayor/menor]: ");
        String númeroElegido = scan.next();
        if (númeroElegido.equalsIgnoreCase("menor")) {
            System.out.printf("El número menor es el %d%n", númeroMenor);
        } else {
            System.out.printf("El número mayor es el %d%n", númeroMayor);
        }
    }

}
