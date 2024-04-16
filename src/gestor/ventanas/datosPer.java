package gestor.ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gestor.empresarial.*;
import gestor.empresarial.empleados.Empleados;

public class datosPer extends JFrame implements ActionListener
{
    private JPanel JDatosPer;
    private JLabel labelId;
    private JTextField textFieldID;
    private JTextField textFieldNombre;
    private JTextField textFieldCorreo;
    private JLabel labelName;
    private JLabel labeCorreo;
    private JButton buttonRegistrar;
    private JButton buttonMenu;
    private JTextField textFieldApellido;
    private JLabel labelApellido;
    private JList list1;

    private Empleados empleados;

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
            String id = textFieldID.getText();
            String nombre = textFieldNombre.getText();
            String apellido = textFieldApellido.getText();
            String correo = textFieldCorreo.getText();

            empleados.addDatosPersonales(nombre,apellido,correo);


        }
        
    }
}
