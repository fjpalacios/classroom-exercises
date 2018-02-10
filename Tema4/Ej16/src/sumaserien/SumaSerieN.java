/*
 * Escribe un programa que calcula y visualiza la suma de los números de la serie
 * 1, 4, 7, 10… mientras el número de la serie sea menor que N,
 * un entero mayor que 10, N se lee de teclado (los números varían de 3 en 3).
 * Se visualiza la serie de valores que se suman y el resultado de la suma
 * (p.e. para N=14 se visualiza 1+4+7+10+13=35)
 */
package sumaserien;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class SumaSerieN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int límite = 0;
        do {
            System.out.print("Introduce un número mayor que 10 para el límite: ");
            try {
                límite = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: introduce un entero mayor que 10");
            }
        } while (límite <= 10);
        System.out.print("1");
        int número = 4;
        int suma = 1;
        while (número < límite) {
            System.out.printf("+%d", número);
            suma += número;
            número += 3;
        }
        System.out.printf("=%d%n", suma);
    }

}
