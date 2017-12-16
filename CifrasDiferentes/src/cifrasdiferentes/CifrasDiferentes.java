/*
 * Escribe un programa que lee de teclado números enteros positivos y nos dice
 * cuántas cifras diferentes contiene.
 * Se repite la lectura hasta introducir un 0
 */
package cifrasdiferentes;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class CifrasDiferentes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int núm = 0;
        do {
            System.out.print("Escribe un número entero positivo ó 0 para salir: ");
            try {
                núm = Integer.parseInt(scan.next());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Error: introduce un número válido");
            }
        } while (núm < 0);
        while (núm > 0) {
            int copiaDeNúm = núm;
            int cifrasDiferentes = 0;
            int numResto = 0;
            int v0 = 0;
            int v1 = 0;
            int v2 = 0;
            int v3 = 0;
            int v4 = 0;
            int v5 = 0;
            int v6 = 0;
            int v7 = 0;
            int v8 = 0;
            int v9 = 0;
            while (copiaDeNúm > 0) {
                numResto = copiaDeNúm % 10;
                copiaDeNúm /= 10;
                switch (numResto) {
                    case 0:
                        v0 = 1;
                        break;
                    case 1:
                        v1 = 1;
                        break;
                    case 2:
                        v2 = 1;
                        break;
                    case 3:
                        v3 = 1;
                        break;
                    case 4:
                        v4 = 1;
                        break;
                    case 5:
                        v5 = 1;
                        break;
                    case 6:
                        v6 = 1;
                        break;
                    case 7:
                        v7 = 1;
                        break;
                    case 8:
                        v8 = 1;
                        break;
                    case 9:
                        v9 = 1;
                        break;
                }
            }
            cifrasDiferentes = v0 + v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9;
            System.out.printf("El número contiene %d cifras diferentes%n", cifrasDiferentes);
            do {
                System.out.print("Escribe un número entero positivo ó 0 para salir: ");
                try {
                    núm = Integer.parseInt(scan.next());
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Error: introduce un número válido");
                }
            } while (núm < 0);
        }
    }

}
