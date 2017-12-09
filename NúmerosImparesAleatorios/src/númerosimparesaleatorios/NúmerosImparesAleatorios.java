/*
 * Escribe un programa que visualiza N números impares aleatorios,
 * N se lee de teclado. Cuando finaliza el bucle se muestra cuántos números
 * se han generado en total.
 */
package númerosimparesaleatorios;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class NúmerosImparesAleatorios {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int númeroDeImpares = 0;
        do {
            System.out.print("¿Cuántos números impares quieres obtener?: ");
            númeroDeImpares = scan.nextInt();
        } while (númeroDeImpares < 1);
        int imparesCalculados = 0;
        int intentos = 0;
        while (imparesCalculados < númeroDeImpares) {
            int númeroAleatorio = (int) Math.floor(Math.random() * 100);
            if (númeroAleatorio % 2 != 0) {
                System.out.print(númeroAleatorio + " ");
                imparesCalculados = imparesCalculados + 1;
            }
            intentos = intentos + 1;
        }
        System.out.println("");
        System.out.printf("Se han obtenido %d números impares en %d intentos%n",
                númeroDeImpares, intentos);
    }

}
