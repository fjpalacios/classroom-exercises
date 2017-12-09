/*
 * Escribe un programa que calcula los intereses generados por una cantidad de
 * dinero. Se lee de teclado: la cantidad de dinero depositada inicialmente, el
 * número de años del depósito y el porcentaje de interés anual. El programa
 * tiene que presentar los intereses generados, así como el dinero total para
 * cada año.
 */
package interésanual;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class InterésAnual {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cantidadDinero = 0;
        do {
            System.out.print("Escribe la cantidad de dinero depositada: ");
            try {
                cantidadDinero = Double.parseDouble(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: debes escribir una cantidad de "
                        + "dinero a depositar");
            }
        } while (cantidadDinero < 1);
        int añosDepósito = 0;
        do {
            System.out.print("Escribe el número de años del depósito: ");
            try {
                añosDepósito = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: debes escribir un número de años");
            }
        } while (añosDepósito < 1);
        int porcentaje = 0;
        do {
            System.out.print("Escribe el porcentaje del interés anual: ");
            try {
                porcentaje = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: debes escribir un número de años");
            }
        } while (porcentaje < 1);
        double interésAnual = 0;
        for (int i = 0; i < añosDepósito; i++) {
            interésAnual = cantidadDinero * porcentaje / 100;
            System.out.printf("Interés del año %d; %.2f%n", i + 1, interésAnual);
            cantidadDinero += interésAnual;
            System.out.printf("Dinero acumulado: %.2f%n", cantidadDinero);
        }
    }

}
