/*
 * Una empresa realiza descuentos a sus clientes en función de su edad,
 * los menores de 4 años no pagan, de 4 a 12 años el 50%, de 13 a 60 años no
 * hay descuento y los mayores de 60 años el 60%. Realiza la enumeración para
 * representar el descuento.
 */
package descuentosempresa;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class DescuentosEmpresa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce la edad de la persona: ");
        int edad = scan.nextInt();
        System.out.print("Introduce el precio de la entrada: ");
        double precio = scan.nextDouble();
        double precioConDescuento = obtenerDescuento(edad, precio);
        System.out.println("El precio final para una persona de " + edad
                + " años es de " + precioConDescuento + "€");
    }

    private static double obtenerDescuento(int edad, double precio) {
        Descuento descuento = Descuento.MENORDE4;

        if (edad >= 4 && edad <= 12) {
            descuento = Descuento.DE4A12;
        } else if (edad >= 13 && edad <= 60) {
            descuento = Descuento.DE13A60;
        } else if (edad > 60) {
            descuento = Descuento.MAYORDE60;
        }

        return precio * (1 - descuento.getDescuento());
    }
}
