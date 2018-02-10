/*
 * Escribe un programa que calcula la suma de los números de la serie
 * 1, 2, 6, 24, 120, 720, 5040…
 * mientras número de la serie sea menor de 10.000.000.
 * Se visualizan los términos de la serie y la suma.
 * El término de la serie se multiplica por 2, 3, 4, 5, 6…
 */
package sumaserie;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class SumaSerie {

    public static void main(String[] args) {
        int número = 1;
        int multiplicación = 1;
        int suma = 0;
        while (número < 10000000) {
            System.out.println(número);
            suma += número;
            multiplicación++;
            número *= multiplicación;
        }
        System.out.printf("La suma total es %d%n", suma);
    }

}
