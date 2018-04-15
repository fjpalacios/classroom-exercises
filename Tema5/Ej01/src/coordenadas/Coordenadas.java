/*
 * Escribe la clase Punto para representar un punto en el plano, ponla en un
 * paquete aparte. Tiene dos atributos: la posición x, y la posición y en el plano,
 * ambos son enteros. Tiene dos constructores, el que da los valores por defecto
 * a los campos y un constructor que recibe los valores de los atributos como
 * parámetros. Los métodos que tiene son los getters y los setters de los
 * atributos. En el main crea un par de puntos con el valor x = 5, y = 12 usando
 * los dos constructores. Luego visualiza los valores de los puntos creados.
 */
package coordenadas;

import punto.Punto;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class Coordenadas {

    public static void main(String[] args) {
        Punto punto1 = new Punto(5, 12);
        System.out.println(punto1);
        Punto punto2 = new Punto();
        punto2.setXY(5, 12);
        System.out.println(punto2);
        Punto punto3 = new Punto();
        punto3.setXY(punto1);
        System.out.println(punto3);
    }

}
