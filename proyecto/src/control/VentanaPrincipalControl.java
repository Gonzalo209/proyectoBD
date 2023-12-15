package control;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipalControl implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        String menu = e.getActionCommand();

        switch (menu) {

            case "Agregar" -> JOptionPane.showMessageDialog(null, "El registro ha sido agregado",
                    "Registro Agregado", JOptionPane.PLAIN_MESSAGE);

            case "Eliminar" -> JOptionPane.showMessageDialog(null, "El registro ha sido eliminado",
                    "Registro Eliminado", JOptionPane.PLAIN_MESSAGE);

            case "Modificar" -> JOptionPane.showMessageDialog(null, "El registro ha sido modificado",
                    "Registro Modificado", JOptionPane.PLAIN_MESSAGE);

        }

    }

}
