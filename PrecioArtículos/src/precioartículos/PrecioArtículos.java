/*
 * Escribe un programa que calcula el importe que hay que pagar por unos
 * artículos. El artículo vale 3.49€ y el porcentaje de IVA es del 21%.
 * De teclado se lee el número de artículos. De teclado se lee si hay que
 * aplicar o no un descuento, si lo hay, entonces se lee el porcentaje de
 * descuento a aplicar. Hay que visualizar el precio bruto, el descuento aplicado
 * el IVA a añadir (sobre el importe neto) y el precio de venta (todos estos
 * valores son euros).
 */
package precioartículos;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class PrecioArtículos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precioArtículo = 3.49;
        System.out.print("¿Cuántos artículos son?: ");
        int númeroArtículos = scan.nextInt();
        System.out.printf("El precio por artículo es: %.2f%n", precioArtículo);
        System.out.print("¿Hay un descuento que aplicar? [s/n]: ");
        String aplicarDescuento = scan.next();
        if (aplicarDescuento.equalsIgnoreCase("s")) {
            System.out.print("¿Cuál es el descuento a aplicar?: ");
            int descuento = scan.nextInt();
            precioArtículo = (precioArtículo - (precioArtículo * descuento) / 100);
            System.out.printf("El precio por artículo con el descuento aplicado"
                    + " es %.2f%n", precioArtículo);
        }
        double precioFinal = ((precioArtículo * 1.21) * númeroArtículos);
        System.out.printf("El precio final aplicándole el IVA es: %.2f%n",
                precioFinal);
    }

}
