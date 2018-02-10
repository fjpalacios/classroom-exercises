/*
 * Escribe un programa que lee de teclado el precio de un artículo y el IVA
 * que hay que aplicarle y visualiza su precio de venta.
 */
package preciomasiva;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class PrecioMasIva {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dime el precio del artículo: ");
        double precio = scan.nextDouble();
        System.out.print("Ahora dime el IVA que corresponde: ");
        int iva = scan.nextInt();
        double pvp = precio + ((precio * iva) / 100);
        System.out.printf("El precio de venta final es de %.2f€%n", pvp);
    }

}
