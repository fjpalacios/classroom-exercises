package dirección;

import java.util.Objects;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class Dirección {

    private String calle;
    private int número;
    private String población;

    public Dirección(String calle, int número, String población) {
        this.calle = calle;
        this.número = número;
        this.población = población;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    @Override
    public String toString() {
        return "calle " + calle + ", número " + número + " - " + población;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.calle);
        hash = 89 * hash + this.número;
        hash = 89 * hash + Objects.hashCode(this.población);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dirección other = (Dirección) obj;
        if (this.número != other.número) {
            return false;
        }
        if (!Objects.equals(this.calle, other.calle)) {
            return false;
        }
        if (!Objects.equals(this.población, other.población)) {
            return false;
        }
        return true;
    }

}
