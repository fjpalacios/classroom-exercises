package clases;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class Conversor {

    public int deEurosAPesetas(double euros) {
        return (int) (euros * 166.386);
    }

    public double dePesetasAEuros(int pesetas) {
        return pesetas / 166.386;
    }

}
