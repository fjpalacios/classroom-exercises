/*
 * Escribe un programa que calcula y visualiza la suma de granos de trigo que
 * caben en un tablero de ajedrez. Se coloca 1 grano en la primera casilla,
 * 2 en la segunda, 4 en la tercera, 8 en la cuarta, 16 en la quinta y así
 * sucesivamente hasta llegar a la última casilla (un tablero de ajedrez tiene
 * 64 casillas). Un grano de trigo pesa 0.033 gramos, expresa el peso del trigo
 * en toneladas.
 */
package granostrigo;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class GranosTrigo {

    public static void main(String[] args) {
        int contador = 0;
        double granos = 0;
        while (contador < 64) {
            granos = granos + Math.pow(2, contador);
            System.out.printf("Casilla: %d, granos %.0f%n", contador + 1, granos);
            contador += 1;
        }
        double toneladas = (granos * 0.033) / 1000000;
        System.out.printf("Hay %.0f granos de trigo, que pesan %f toneladas%n",
                granos, toneladas);
    }

}
