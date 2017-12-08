/*
 * Escribe un programa que resuelve una ecuación de segundo grado a*x²+b*x+c=0
 * a, b y c se leen de teclado.
 * El discriminante es b²-4*a*c en el algoritmo se llama d.
 * La forma de calcular la x es:
 * Si a=0, b=0 y c=0 entonces es evidente
 * Si a=0, b=0 y c!=0 entonces es absurdo
 * Si a=0, b!=0 y c cualquiera entonces es x = -c/b
 * Si a!=0, d>0 entonces tenemos dos raíces reales
 * Si a!=0, d=0 entonces tenemos una raíz doble x = -b/2a
 * Si a!=0, d<0 entonces tenemos dos raíces imaginarias
 */
package ecuaciónsegundogrado;

import java.util.Scanner;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class EcuaciónSegundoGrado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el primer término de la ecuación: ");
        double término1 = scan.nextDouble();
        System.out.print("Introduce el segundo término de la ecuación: ");
        double término2 = scan.nextDouble();
        System.out.print("Introduce el tercer término de la ecuación: ");
        double término3 = scan.nextDouble();
        double discriminante = Math.pow(término2, 2) - 4 * término1 * término3;
        System.out.printf("%.2fx² %.2fx %.2f%n", término1, término2, término3);
        if (discriminante >= 0) {
            double x1, x2;
            if (término1 == 0 && término2 == 0) {
                if (término3 == 0) {
                    x1 = 0;
                    System.out.println("x = " + x1);
                } else {
                    System.out.println("No tiene sentido lo que has introducido");
                }
            }
            if (término1 == 0 && término2 != 0) {
                x1 = (-término3) / término2;
                System.out.println("x = " + x1);
            }
            if (término1 != 0) {
                if (discriminante == 0) {
                    x1 = ((-término2) / (2 * término1));
                    System.out.println("x = " + x1);
                } else {
                    x1 = (-término2 + Math.sqrt(discriminante)) / (2 * término1);
                    System.out.println("x1 = " + x1);
                    x2 = (-término2 - Math.sqrt(discriminante)) / (2 * término1);
                    System.out.println("x2 = " + x2);
                }
            }
        } else {
            System.out.println("La ecuación tiene un resultado imaginario");
            double parteReal = (-término2) / (2 * término1);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * término1);
            System.out.printf("%.2f+i%.2f%n", parteReal, parteImaginaria);
            System.out.printf("%.2f-i%.2f%n", parteReal, parteImaginaria);
        }
    }

}
