/*
 * Queremos representar un padre (Julio) y un hijo (Fernando) que viven en la
 * misma casa (calle Mayor, num 15 de Bonpoble), luego el hijo se emancipa y
 * se muda (calle Mayor, num 22 de Bonpoble).
 * El padre y el hijo son de clase Persona que tiene un nombre (String) y una
 * dirección. La dirección de la casa es una clase que tiene una calle (String),
 * un número (int) y un pueblo (String).
 */
package julioyfernando;

import dirección.Dirección;
import persona.Persona;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class JulioYFernando {

    public static void main(String[] args) {
        Dirección direcciónPadre = new Dirección("Mayor", 15, "Bonpoble");
        Dirección direcciónHijo = new Dirección("Mayor", 15, "Bonpoble");
        Persona padre = new Persona("Julio", direcciónPadre);
        Persona hijo = new Persona("Fernando", direcciónHijo);
        System.out.println("Antes de la emancipación");
        System.out.println("Padre: " + padre + "\nHijo: " + hijo);
        String vivenJuntos = hijo.getDirección().equals(padre.getDirección())
                ? "Sí" : "No";
        System.out.println("¿Viven juntos? " + vivenJuntos);
        System.out.println("Me emancipo, tengo casa propia");
        hijo.getDirección().setNúmero(22);
        System.out.println("Padre: " + padre + "\nHijo: " + hijo);
        vivenJuntos = hijo.getDirección().equals(padre.getDirección())
                ? "Sí" : "No";
        System.out.println("¿Viven juntos? " + vivenJuntos);
    }

}
