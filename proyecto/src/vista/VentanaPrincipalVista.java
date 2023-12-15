package vista;

import control.VentanaPrincipalControl;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipalVista extends JFrame {

    private static JTextField txtId = new JTextField(10);
    private static JTextField txtNombre = new JTextField(10);
    private static JTextField txtApellidos = new JTextField(10);

    public static JTextField getTxtId() {

        return txtId;

    }

    public static JTextField getTxtNombre() {

        return txtNombre;

    }

    public static JTextField getTxtApellidos() {

        return txtApellidos;

    }

    public static JTextField getTxtTelefono() {

        return txtTelefono;

    }

    public static JTextField getTxtEdad() {

        return txtEdad;

    }

    public static JTextField getTxtPeso() {

        return txtPeso;

    }

    public static JTextField getTxtTalla() {

        return txtTalla;

    }

    public static JTextField getTxtPadecimiento() {

        return txtPadecimiento;

    }

    private static JTextField txtTelefono = new JTextField(10);
    private static JTextField txtEdad = new JTextField(10);
    private static JTextField txtPeso = new JTextField(10);
    private static JTextField txtTalla = new JTextField(10);
    private static JTextField txtPadecimiento = new JTextField(10);

    public VentanaPrincipalVista() {

        super("Proyecto Final (Pacientes)");

        setSize(590 ,400);

        add(crearPanelPrincipal());

        setVisible(true);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private JPanel crearPanelEdicion() {

        JPanel pnlEdicion = new JPanel();

        JLabel lblId = new JLabel("Id: ");
        JLabel lblNombre = new JLabel("Nombre: ");
        JLabel lblApellidos = new JLabel("Apellidos: ");
        JLabel lblTelefono = new JLabel("Telefono: ");
        JLabel lblEdad = new JLabel("Edad: ");
        JLabel lblPeso = new JLabel("Peso: ");
        JLabel lblTalla = new JLabel("Talla: ");
        JLabel lblPadecimiento = new JLabel("Padecimiento: ");

        pnlEdicion.setLayout(new GridLayout(8, 2, 3, 3));

        pnlEdicion.add(lblId);
        pnlEdicion.add(txtId);

        pnlEdicion.add(lblNombre);
        pnlEdicion.add(txtNombre);

        pnlEdicion.add(lblApellidos);
        pnlEdicion.add(txtApellidos);

        pnlEdicion.add(lblTelefono);
        pnlEdicion.add(txtTelefono);

        pnlEdicion.add(lblEdad);
        pnlEdicion.add(txtEdad);

        pnlEdicion.add(lblPeso);
        pnlEdicion.add(txtPeso);

        pnlEdicion.add(lblTalla);
        pnlEdicion.add(txtTalla);

        pnlEdicion.add(lblPadecimiento);
        pnlEdicion.add(txtPadecimiento);

        return pnlEdicion;

    }

    private JPanel crearPanelPrincipal() {

        JPanel pnlPrincipal = new JPanel();

        pnlPrincipal.setLayout(new BorderLayout());

        pnlPrincipal.add(crearPanelBusqueda(), BorderLayout.NORTH);

        pnlPrincipal.add(crearPanelEdicion(), BorderLayout.CENTER);

        pnlPrincipal.add(crearPanelControl(), BorderLayout.SOUTH);

        return pnlPrincipal;

    }

    private JPanel crearPanelBusqueda() {

        JPanel pnlBusqueda = new JPanel();

        pnlBusqueda.setLayout(new BoxLayout(pnlBusqueda, BoxLayout.X_AXIS));

        pnlBusqueda.setBorder(BorderFactory.createTitledBorder("BUSQUEDA DE PACIENTE"));

        JLabel lblBuscar = new JLabel("Buscar ID: ");

        JTextField txtBuscarId = new JTextField(10);

        JButton btnBuscar = new JButton("Buscar");

        pnlBusqueda.add(lblBuscar);

        pnlBusqueda.add(Box.createHorizontalStrut(20));

        pnlBusqueda.add(txtBuscarId);

        pnlBusqueda.add(Box.createHorizontalStrut(20));

        pnlBusqueda.add(btnBuscar);

        return pnlBusqueda;

    }

    private JPanel crearPanelControl() {

        JPanel pnlControl = new JPanel();

        pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));

        pnlControl.setBorder(BorderFactory.createTitledBorder("OPCIONES DE CONTROL"));

        JButton btnAgregar = new JButton("Agregar");

        btnAgregar.addActionListener(new VentanaPrincipalControl());

        JButton btnEliminar = new JButton("Eliminar");

        btnEliminar.addActionListener(new VentanaPrincipalControl());

        JButton btnModificar = new JButton("Modificar");

        btnModificar.addActionListener(new VentanaPrincipalControl());

        pnlControl.add(Box.createHorizontalStrut(100));

        pnlControl.add(btnAgregar);

        pnlControl.add(Box.createHorizontalStrut(20));

        pnlControl.add(btnEliminar);

        pnlControl.add(Box.createHorizontalStrut(20));

        pnlControl.add(btnModificar);

        return pnlControl;

    }



}
