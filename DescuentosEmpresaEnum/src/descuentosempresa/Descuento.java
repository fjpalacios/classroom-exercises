package descuentosempresa;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public enum Descuento {
    MENORDE4(1),
    DE4A12(0.5),
    DE13A60(0),
    MAYORDE60(0.6);

    private final double descuento;

    private Descuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}
