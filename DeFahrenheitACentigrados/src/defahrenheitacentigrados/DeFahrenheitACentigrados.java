/*
 * Escribe un programa que lee de teclado una temperatura en grados Fahrenheit
 * y presenta en pantalla la temperatura en grados centígrados.
 * Una temperatura en grados centígrados C, puede ser convertida a su valor
 * equivalente de la escala Fahrenheit con la fórmula: F = (9 / 5) C + 32.
 */
package defahrenheitacentigrados;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class DeFahrenheitACentigrados {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.UK);
        System.out.print("Escribe una temperatura en grados fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        double centígrados = (fahrenheit - 32) * (5 / 9.0);
        System.out.printf("%.2fºF equivalen a %.2fºC%n", fahrenheit, centígrados);
    }

}
