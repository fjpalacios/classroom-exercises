/*
 * Escribe un programa que lee de teclado el radio de un círculo y visualiza
 * su área y su perímetro ( a = PI * r^2 , p = 2 * PI * r)
 */
package circuloareaperimetro;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class CirculoAreaPerimetro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe el radio de un círculo: ");
        double radio = scan.nextDouble();
        double área = Math.PI * Math.pow(radio, 2);
        double perímetro = 2 * Math.PI * radio;
        System.out.printf("El área de un círculo con radio %.2f es %.2f "
                + "y su perímetro es %.2f%n", radio, área, perímetro);
    }

}
