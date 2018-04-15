package persona;

import dirección.Dirección;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class Persona {
    private String nombre;
    private Dirección dirección;

    public Persona(String nombre, Dirección dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
    }

    public Dirección getDirección() {
        return dirección;
    }

    @Override
    public String toString() {
        return nombre + ", " + dirección;
    }
    
    
    
}
