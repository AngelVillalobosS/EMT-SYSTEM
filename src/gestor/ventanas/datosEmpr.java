package gestor.ventanas;

import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.empleados.Empleados;
import gestor.empresarial.empresa.Empresa;
import gestor.errores.GestionErrores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mysql.ConectorMySQL;

public class datosEmpr extends JFrame implements ActionListener
{

    private JPanel JDatosEmp;
    private JLabel labelTitulo;
    private JButton botonMenu;
    private JTextField nombreEmField;
    private JTextField rfcField;
    private JButton botonRegistrar;
    private JButton buttonMostrar;
    private JTextField textFieldTelefonoE;
    private JTextField textFieldID;
    private JLabel LabelAdscripcion;
    private JTextField adscripcionField;
    private JLabel LabelLada;
    private JTextField extensionField;
    private JLabel labelTelEmp;
    private JTextField whatsappField;
    private JLabel labelPuesto;
    private JTextField puestoField;
    private JTextField correoField;
    private JTextField apellidosField;
    private JTextField nombreField;
    private DatosEmpresariales datosE;
    private Empleados empleado;
    private Empresa empresa;

    private JMenu menu;
    private DatosEmpresariales datosEmpleado;
    private GestionErrores error;
    private final Empleados empleados;

    public JPanel getJDatosEmpr()
    {
        return JDatosEmp;
    }

    public datosEmpr()
    {
        menu = new JMenu();
        datosEmpleado = new DatosEmpresariales(12,"a", "23131", "231");
        botonMenu.addActionListener(this);
        botonRegistrar.addActionListener(this);
        empleados = new Empleados();
        empresa = new Empresa("x", "x");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == botonMenu)
        {
            JMenu nuevoMenu = new JMenu();
            nuevoMenu.setVisible(true);
            this.dispose();
        }

        if(e.getSource().equals(botonRegistrar))
        {
            if (!nombreField.getText().isEmpty() && !apellidosField.getText().isEmpty() && !correoField.getText().isEmpty() && !whatsappField.getText().isEmpty() && !adscripcionField.getText().isEmpty() && !extensionField.getText().isEmpty() && !puestoField.getText().isEmpty()){
                System.out.println("Se entro a registrar");
                String nombre = nombreField.getText();
                String apellidos = apellidosField.getText();
                String correo = correoField.getText();
                String whatsapp = whatsappField.getText();
                String adscripcion = adscripcionField.getText();
                String extension = extensionField.getText();
                String puesto = puestoField.getText();

                int resultado = empleados.addEmpleado(nombre, apellidos, correo, whatsapp, adscripcion, extension, puesto);
                System.out.println(resultado);

                if (resultado == 1) {
                    JOptionPane.showMessageDialog(null, "Se ha registrado con éxito " + resultado);
                    nombreField.setText("");
                    apellidosField.setText("");
                    correoField.setText("");
                    whatsappField.setText("");
                    adscripcionField.setText("");
                    extensionField.setText("");
                    puestoField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar, Intente de nuevo");
                }

            } else{
                //En dado caso que haya una casilla vacia se manda un mensaje de error
                System.out.println("Error al guardar");
                JOptionPane.showMessageDialog(null, error.getError(9));
            }
        }
    }
}