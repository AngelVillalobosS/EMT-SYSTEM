package gestor.ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import gestor.empresarial.empleados.Empleados;
import gestor.errores.GestionErrores;
import mysql.ConectorMySQL;

public class datosPer extends JFrame implements ActionListener
{
    private JPanel JDatosPer;
    private JTextField idField;
    private JTextField nombreField;
    private JTextField emailField;
    private JLabel labelName;
    private JLabel labelCorreo;
    private JButton buttonRegistrar;
    private JButton buttonMenu;
    private JTextField apellidoField;
    private JLabel labelApellido;
    private JTextField whatsappField;
    private JLabel labelWhats;
    private JButton buttonMostrar;
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
        buttonMenu.addActionListener(e -> actionPerformed(e));
        buttonMostrar.addActionListener(e -> actionPerformed(e));
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
            if (!nombreField.getText().isEmpty() && !apellidoField.getText().isEmpty() && !emailField.getText().isEmpty() && !whatsappField.getText().isEmpty()){
                System.out.println("Se entro a registrar");
                String nombre = nombreField.getText();
                String apellido = apellidoField.getText();
                String correo = emailField.getText();
                String whatsapp = whatsappField.getText();

                int resultado = empleados.addAspirante(nombre, apellido, correo, whatsapp);
                System.out.println(resultado);

                if (resultado == 1) {
                    JOptionPane.showMessageDialog(null, "Se ha registrado con éxito " + resultado);
                    nombreField.setText("");
                    apellidoField.setText("");
                    emailField.setText("");
                    whatsappField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar, Intente de nuevo");
                }

            } else{
                //En dado caso que haya una casilla vacia se manda un mensaje de error
                System.out.println("Error al guardar");
                JOptionPane.showMessageDialog(null, error.getError(9));
            }
        }
        if (e.getSource().equals(buttonMostrar)){
            try {
                Connection conn = ConectorMySQL.getInstance().getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Aspirante");
                String output = "ID \tNombre \t\tApellidos \t\tCorreo \t\tWhatsapp \n";
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("nombre");
                    String lastname = rs.getString("apellidos");
                    String email = rs.getString("correo");
                    String wa = rs.getString("whatsapp");

                    output = output + id + " | " + name + " " + lastname + " " + email + " " + wa + "\n";
                }
                JOptionPane.showMessageDialog(null, output);
            } catch (SQLException error) {
                System.out.println("SQL Error: " + error.getMessage());
            }
        }
    }
}
