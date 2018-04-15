package lógicas;

import clases.Conversor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import vistas.PrincipalV;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class PrincipalLOG implements ActionListener {

    private PrincipalV ventanaPrincipal;

    public PrincipalLOG() {
        ventanaPrincipal = new PrincipalV();
        ventanaPrincipal.setOyente(this);
        ventanaPrincipal.setLocationRelativeTo(ventanaPrincipal);
        ventanaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!"".equals(ventanaPrincipal.getEuros())
                && !"".equals(ventanaPrincipal.getPesetas())
                && !"limpia".equals(e.getActionCommand())) {
            showMessageDialog(null, "Rellena sólo uno de los dos campos",
                    "Error", WARNING_MESSAGE);
        } else {
            Conversor cambiador = new Conversor();
            String dinero;
            switch (e.getActionCommand()) {
                case "cambiaAPesetas":
                    dinero = ventanaPrincipal.getEuros();
                    if (doubleMayorQue0(dinero)) {
                        double euros = Double.parseDouble(dinero);
                        String deEurosAPesetas = String.format("%d",
                                cambiador.deEurosAPesetas(euros));
                        ventanaPrincipal.setPesetas(deEurosAPesetas);
                    } else {
                        showMessageDialog(null, "Introduce un número válido",
                                "Error", WARNING_MESSAGE);
                        ventanaPrincipal.limpiaEuros();
                    }
                    break;
                case "cambiaAEuros":
                    dinero = ventanaPrincipal.getPesetas();
                    if (intMayorQue0(dinero)) {
                        int pesetas = Integer.parseInt(dinero);
                        String dePesetasAEuros = String.format("%.2f",
                                cambiador.dePesetasAEuros(pesetas));
                        ventanaPrincipal.setEuros(dePesetasAEuros);
                    } else {
                        showMessageDialog(null, "Introduce un número válido",
                                "Error", WARNING_MESSAGE);
                        ventanaPrincipal.limpiaPesetas();
                    }
                    break;
                case "limpia":
                    ventanaPrincipal.limpiaPesetas();
                    ventanaPrincipal.limpiaEuros();
                    break;
            }
        }
    }

    private boolean intMayorQue0(String número) {
        int númeroVálido;
        try {
            númeroVálido = Integer.parseInt(número);
            if (númeroVálido < 0) {
                return false;
            }
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    private boolean doubleMayorQue0(String número) {
        double númeroVálido;
        try {
            númeroVálido = Double.parseDouble(número);
            if (númeroVálido < 0) {
                return false;
            }
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

}
