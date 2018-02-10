/*
 * Escribe un programa que asigna una calificación literal a un estudiante,
 * basada en la tabla de puntuaciones:
 * 8.5 a 10 Sobresaliente
 * 7 a 8.5 Notable
 * 6 a 7 Bien
 * 5 a 6 Suficiente
 * 3.5 a 5 Insuficiente
 * 0 a 3.5 Muy deficiente
 * El programa captura un valor numérico del teclado y visualiza la calificación
 * correspondiente.
 */
package notasdenúmeroatexto;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class NotasDeNúmeroATexto {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("¿Qué nota tienes?: ");
        double nota = scan.nextDouble();
        String notaEnTexto = notaEnTexto(nota);
        System.out.printf("Tu nota numérica equivale a un %s.%n", notaEnTexto);
    }

    private static String notaEnTexto(double nota) {
        String texto = "";
        if (nota >= 0 && nota < 3.5) {
            texto = "muy deficiente";
        } else if (nota >= 3.5 && nota < 5) {
            texto = "insuficiente";
        } else if (nota >= 5 && nota < 6) {
            texto = "suficiente";
        } else if (nota >= 6 && nota < 7) {
            texto = "bien";
        } else if (nota >= 7 && nota < 8.5) {
            texto = "notable";
        } else if (nota >= 8.5 && nota <= 10) {
            texto = "sobresaliente";
        }
        return texto;
    }

}
