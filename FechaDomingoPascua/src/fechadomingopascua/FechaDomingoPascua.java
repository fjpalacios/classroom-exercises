/*
 * Escribe un programa que calcula la fecha del domingo de pascua,
 * es decir el primer domingo después de la primera luna llena que sigue al
 * equinoccio de primavera. Se lee de teclado el año del cual se quiere
 * calcular la fecha. Los cálculos siguientes nos dan el número de días del mes
 * de Marzo en el que cae el domingo de Pascua:
 *
 * A = año % 19
 * B = año % 4
 * C = año % 7
 * D = (19 * A + 24) % 30
 * E = (2 * B + 4 * C + 6 * D + 5) % 7
 * dias = 22 + D + E
 * dias puede ser mayor que 31, lo que indica que el domingo de pascua cae en abril.
 */
package fechadomingopascua;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class FechaDomingoPascua {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("¿Cuál es tu año elegido?: ");
        int año = scan.nextInt();
        int días = domingoPascua(año);
        System.out.println(díaDomingoPascua(días, año));
    }

    private static int domingoPascua(int año) {
        int A = año % 19;
        int B = año % 4;
        int C = año % 7;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int días = 22 + D + E;
        return días;
    }

    private static String díaDomingoPascua(int días, int año) {
        String mes = "";
        String día = "";
        if (días <= 31) {
            día = días + "";
            mes = "marzo";
        } else {
            día = días - 31 + "";
            mes = "abril";
        }
        return "En el año " + año + " el Domingo de Pascua cae en el día "
                + día + " de " + mes;
    }

}
