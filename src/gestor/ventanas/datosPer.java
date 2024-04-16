package gestor.ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gestor.empresarial.empleados.Empleados;

public class datosPer extends JFrame implements ActionListener
{
    private JPanel JDatosPer;
    private JLabel labelId;
    private JTextField idField;
    private JTextField nombreField;
    private JTextField emailField;
    private JLabel labelName;
    private JLabel labeCorreo;
    private JButton buttonRegistrar;
    private JButton buttonMenu;
    private JTextField apellidoField;
    private JLabel labelApellido;
    private JList list1;

    private final Empleados empleados;

    public JPanel getJDatosPer()
    {
        return JDatosPer;
    }

    datosPer()
    {
        buttonRegistrar.addActionListener(this);
        buttonMenu.addActionListener(this);
        empleados = new Empleados();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == buttonMenu)
        {
            dispose();
        }

        if(e.getSource() == buttonRegistrar) {
            String id = idField.getText();
            String nombre = nombreField.getText();
            String apellido = apellidoField.getText();
            String correo = emailField.getText();

            empleados.addDatosPersonales(id, nombre, apellido, correo);
        }
    }
}
