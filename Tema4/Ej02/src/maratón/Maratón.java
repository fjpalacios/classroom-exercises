/*
 * Escribe un programa que determina si un atleta puede correr una maratón.
 * Para seleccionar a un corredor, tiene que haber acabado una maratón anterior
 * en un tiempo inferior a: 190 minutos para hombres menores de 35 años,
 * 225 minutos per a hombres mayores de 35 años, y 240 minutos para mujeres.
 * Los datos a introducir son: sexo, edad y tiempo efectuado en la su anterior
 * maratón. El programa visualiza los mensajes "Seleccionado", "No seleccionado",
 * "Seleccionada", "No seleccionada" o “No puede participar” si la persona es
 * menor de edad o no ha corrido un maratón anterior.
 */
package maratón;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class Maratón {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("¿Ha corrido alguna maratón anteriormente? [s/n]: ");
        String maratónAnterior = scan.next();
        if (maratónAnterior.equalsIgnoreCase("s")) {
            System.out.print("Escribe la edad de la persona: ");
            int edad = scan.nextInt();
            if (edad >= 18) {
                System.out.print("Escribe el sexo de la persona [hombre/mujer]: ");
                String sexo = scan.next();
                System.out.print("¿En cuántos minutos realizó su anterior maratón?: ");
                int tiempo = scan.nextInt();
                if (sexo.equalsIgnoreCase("mujer")) {
                    if (tiempo < 180) {
                        System.out.println("Seleccionada");
                    } else {
                        System.out.println("No seleccionada");
                    }
                }
                if (sexo.equalsIgnoreCase("hombre")) {
                    if (edad < 35 && tiempo < 150) {
                        System.out.println("Seleccionado");
                    } else if (edad >= 35 && tiempo < 175) {
                        System.out.println("Seleccionado");
                    } else {
                        System.out.println("No seleccionado");
                    }
                }
            } else {
                System.out.println("No puede participar");
            }
        } else {
            System.out.println("No puede participar");
        }
    }

}
