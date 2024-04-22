//BusquedaEmpleados
package gestor.ventanas.empleados;

import gestor.empresarial.empleados.Empleados;
import gestor.errores.GestionErrores;
import mysql.ConectorMySQL;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusquedaEmpleados extends JFrame implements ActionListener
{
    private JButton botonMenu;
    private JButton botonBuscar;
    private JPanel JPanelEmp;
    private JTextField idField;
    private JTable mostrarDatosEmpleados;
    private GestionErrores error;
    private Empleados empleados;

    public BusquedaEmpleados()
    {
        System.out.println("BusquedaEmpleados");
        botonBuscar.addActionListener(e -> actionPerformed(e));
        botonMenu.addActionListener(e -> actionPerformed(e));
        empleados = new Empleados();
    }

    public JPanel getJPanelEmpr()
    {
        return JPanelEmp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //if que actua al detectar click en boton Menu
        if(e.getSource() == botonMenu)
        {
            System.out.println("Se clickeo menu");
            JMenu nuevoMenu = new JMenu();
            nuevoMenu.setVisible(true);
            this.dispose();
        }
        if (e.getSource().equals(botonBuscar)){
            try {
                Connection conn = ConectorMySQL.getInstance().getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM empleado");
                String output = "ID \tNombre \t\tApellidos \t\tCorreo \t\tWhatsapp  \t\tAdscripcion \t\tpuesto \t\ttipo_puesto\n";
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("nombre");
                    String lastname = rs.getString("apellidos");
                    String email = rs.getString("correo");
                    String wa = rs.getString("whatsapp");
                    String ads = rs.getString("adscripcion");
                    String puesto = rs.getString("puesto");
                    String tipo_puesto = rs.getString("tipo_puesto");

                    output = output + id + " | " + name + " " + lastname + " " + email + " " + wa + " " + ads + " " + puesto + " " + tipo_puesto + "\n";
                    
                }
                JOptionPane.showMessageDialog(null, output);
            } catch (SQLException error) {
                System.out.println("SQL Error: " + error.getMessage());
            }
        }
    }
}