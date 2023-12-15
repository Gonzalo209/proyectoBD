package control;

import conexion.Conexion;
import vista.VentanaPrincipalVista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipalControl implements ActionListener {

    private Conexion conexion = new Conexion();

    @Override
    public void actionPerformed(ActionEvent e) {

        String menu = e.getActionCommand();

        switch (menu) {

            case "Agregar" -> agregarPaciente();

            case "Eliminar" -> JOptionPane.showMessageDialog(null, "El registro ha sido eliminado",
                    "Registro Eliminado", JOptionPane.PLAIN_MESSAGE);

            case "Modificar" -> JOptionPane.showMessageDialog(null, "El registro ha sido modificado",
                    "Registro Modificado", JOptionPane.PLAIN_MESSAGE);

        }

    }

    private void agregarPaciente() {

        int resultado = conexion.insrtarPaciente(Integer.parseInt(VentanaPrincipalVista.getTxtId().getText()),
                                    Integer.parseInt(VentanaPrincipalVista.getTxtEdad().getText()),
                                    Float.parseFloat(VentanaPrincipalVista.getTxtPeso().getText()),
                                    Float.parseFloat(VentanaPrincipalVista.getTxtTalla().getText()),
                                    VentanaPrincipalVista.getTxtPadecimiento().getText(),
                            0);

        if(resultado == 1) {

            JOptionPane.showMessageDialog(null, "Paciente agregado", "Paciente agregado",
                    JOptionPane.PLAIN_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(null, "Paciente no agregado", "Paciente no agregado",
                    JOptionPane.PLAIN_MESSAGE);

        }

    }

}
