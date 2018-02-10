/*
 * Escribe un programa que lee tres números y visualiza el número cuyo valor
 * está al medio (por ejemplo, si leemos 45, 3 y 7 nos mostrará el 7 que está
 * entre el 3 y el 45)
 */
package númerodelmedio;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class NúmeroDelMedio {

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
        int númeroDelMedio = númeroMayor;
        if (número3 > númeroMenor && número3 < númeroMayor) {
            númeroDelMedio = número3;
        }
        if (número3 < númeroMenor) {
            númeroDelMedio = númeroMenor;
        }
        System.out.printf("El número que está en el medio es el %d%n", númeroDelMedio);
    }
}
