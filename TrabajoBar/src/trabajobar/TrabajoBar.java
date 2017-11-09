/*
 * Escribe un programa que calcula y visualiza lo que tiene que pagarnos
 * nuestro jefe por nuestro trabajo en un bar. Nos paga 5 € por hora de lunes a
 * viernes, y 6.5 € por hora el sábado y domingo. Hay 5 trabajadores y las
 * propinas se reparten entre todos. Finalmente, hay que descontar el precio de
 * las comidas que hemos realizado en el bar, cada comida vale 4€.
 */
package trabajobar;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class TrabajoBar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("¿Cuántas horas has trabajado de lunes a viernes?: ");
        double deLunesAViernes = scan.nextDouble();
        System.out.print("¿Cuántas horas has trabajado en fin de semana?: ");
        double sábadoODomingo = scan.nextDouble();
        System.out.print("¿Cuánto dinero hay recaudado en propinas?: ");
        double propinas = scan.nextDouble();
        System.out.print("¿Cuántas veces te has quedado a comer?: ");
        int comidas = scan.nextInt();
        double dineroDeLunesAViernes = deLunesAViernes * 5;
        double dineroSábadoODomingo = sábadoODomingo * 6.5;
        double propinaParaCadaUno = propinas / 5.0;
        int precioComidas = comidas * 4;
        double dineroAPagar = dineroDeLunesAViernes + dineroSábadoODomingo
                + propinaParaCadaUno - precioComidas;
        System.out.printf("El dinero que te corresponde es %.2f€%n", dineroAPagar);
    }

}
