/*
 * Escribe un programa que lee dos números y la operación a realizar sobre ellos,
 * y luego presenta el resultado de la operación. Los símbolos que definen las
 * operaciones son los operadores aritméticos (+, -, *, /, %) y la operación a
 * realizar es la operación aritmética correspondiente. Si no se introduce uno
 * de esos cinco símbolos se visualiza un mensaje de error.
 */
package calculadoradosnúmeros;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class CalculadoraDosNúmeros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        double número1 = scan.nextDouble();
        System.out.print("Escribe otro número: ");
        double número2 = scan.nextDouble();
        System.out.print("¿Qué operación quieres hacer? [+, -, *, /, %]: ");
        String operación = scan.next();
        double resultado = 0;
        switch (operación) {
            case "+":
                resultado = número1 + número2;
                System.out.printf("%.2f + %.2f = %.2f%n", número1, número2, resultado);
                break;
            case "-":
                resultado = número1 - número2;
                System.out.printf("%.2f - %.2f = %.2f%n", número1, número2, resultado);
                break;
            case "*":
                resultado = número1 * número2;
                System.out.printf("%.2f * %.2f = %.2f%n", número1, número2, resultado);
                break;
            case "/":
                resultado = número1 / número2;
                System.out.printf("%.2f / %.2f = %.2f%n", número1, número2, resultado);
                break;
            case "%":
                resultado = número1 % número2;
                System.out.printf("%.2f mod %.2f = %.2f%n", número1, número2, resultado);
                break;
            default:
                System.out.println("La operación introducida no está disponible");
        }
    }

}
