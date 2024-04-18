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
    private JLabel labelWhatapp;
    private JTextField textFieldWhatsapp;
    private JList list1;
    private Menu menu;
    private Empleados empleados;


    public JPanel getJDatosPer()
    {
        return JDatosPer;
    }

    public datosPer()
    {
        buttonRegistrar.addActionListener(this);
        buttonMenu.addActionListener(this);
        menu = new Menu();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == buttonMenu)
        {

        }

        if(e.getSource() == buttonRegistrar) {
            String id = idField.getText();
            String nombre = nombreField.getText();
            String apellido = apellidoField.getText();
            String correo = emailField.getText();
            String whatapp = textFieldWhatsapp.getText();

            empleados.addDatosPersonales(id, nombre, apellido, correo);
            empleados.setWhatsapp(Integer.parseInt(id), whatapp);
        }
    }

    public void mostrarMenu() {
        JFrame frame = new JFrame("MENU");

        Menu menu = new Menu();

        frame.setContentPane(menu.getJMenu());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
