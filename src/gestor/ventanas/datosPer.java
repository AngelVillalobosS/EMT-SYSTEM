package gestor.ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gestor.empresarial.empleados.Empleados;
import gestor.errores.GestionErrores;
public class datosPer extends JFrame implements ActionListener
{
    private JPanel JDatosPer;
    private JLabel labelId;
    private JTextField idField;
    private JTextField nombreField;
    private JTextField emailField;
    private JLabel labelName;
    private JLabel labelCorreo;
    private JButton buttonRegistrar;
    private JButton buttonMenu;
    private JTextField apellidoField;
    private JLabel labelApellido;
    private JList list1;
    private GestionErrores error;

    private final Empleados empleados;

    public JPanel getJDatosPer()
    {
        System.out.println("getterDatosPer");
        this.error = new GestionErrores();
        return JDatosPer;
    }

    //Construtor de datosPer
    public datosPer()
    {
        System.out.println("DatosPer");
        buttonRegistrar.addActionListener(e -> actionPerformed(e));
        buttonMenu.addActionListener(this);
        empleados = new Empleados();
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Se ingreso a la clase ");

        //if que actua al recibir un click en boton Menu
        if(e.getSource() == buttonMenu)
        {
            System.out.println("Se clickeo menu");
            JMenu nuevoMenu = new JMenu();
            nuevoMenu.setVisible(true);
            this.dispose();
        }

        //if que actual al seleccionar el boton registrar
        if(e.getSource().equals(buttonRegistrar)) {
            //Se valida que no haya ninguna casilla vacia
            if (!idField.getText().isEmpty() && !nombreField.getText().isEmpty() && !apellidoField.getText().isEmpty() && !emailField.getText().isEmpty()){
                System.out.println("Se entro a registrar");
                Integer id = idField.getColumns();
                String nombre = nombreField.getText();
                String apellido = apellidoField.getText();
                String correo = emailField.getText();
                empleados.addAspirante(id, nombre, apellido, correo);

                JOptionPane.showMessageDialog(null, "Se ha registrado con éxito");

            } else{
                //En dado caso que haya una casilla vacia se manda un mensaje de error
                System.out.println("Error al guardar");
                JOptionPane.showMessageDialog(null, error.getError(9));
            }
        }
    }
}
