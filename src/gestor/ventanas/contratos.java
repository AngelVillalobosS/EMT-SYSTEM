package gestor.ventanas;

import gestor.empresarial.contrato.Contrato;
import gestor.empresarial.empleados.Empleados;
import gestor.empresarial.empresa.Empresa;
import mysql.ConectorMySQL;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class contratos extends JFrame implements ActionListener
{

    private JPanel JContratos;
    private JLabel LabelContratos;
    private JButton buttonMenu;
    private JTextField idEmpleadoField;
    private JLabel labelTelfonoEm;
    private JTextField extensionField;
    private JLabel labelCargo;
    private JComboBox cargoComboBox;
    private JButton buttonRegistar;
    private JRadioButton consentRadioButton;
    private JButton shContrButton;
    private Contrato contrato;
    private Empleados contratos;
    private Empresa empresa;


    public JPanel getJContratos()
    {
        return JContratos;
    }

    contratos()
    {
        buttonMenu.addActionListener(e -> actionPerformed(e));
        shContrButton.addActionListener(e -> actionPerformed(e));
        buttonRegistar.addActionListener(e -> actionPerformed(e));
        cargoComboBox.setModel(new DefaultComboBoxModel<>(Cargos.values()));
        contratos = new Empleados();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonMenu) {
            System.exit(0);
        }

        if (e.getSource() == shContrButton) {
            try {
                Connection conn = ConectorMySQL.getInstance().getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM contrato");
                String output = "ID \tID_Empleado \t\tExtension \t\tCorreo \t\tWhatsapp  \t\tAdscripcion \t\tpuesto \t\ttipo_puesto\n";
                while (rs.next()) {
                    int id = rs.getInt("id");
                    int id_empleado = rs.getInt("id_empleado");
                    String telefono_empresa = rs.getString("telefono_empresa");
                    String extension = rs.getString("extension");
                    String tipo_contrato = rs.getString("tipo_contrato");
                    String nombre_empresa = rs.getString("nombre_empresa");
                    String rfc_empresa = rs.getString("rfc_empresa");

                    output = output + id + " | " + id_empleado + " | " + telefono_empresa + " " + extension + " " + tipo_contrato + " " + nombre_empresa + " " + rfc_empresa + "\n";

                }
                JOptionPane.showMessageDialog(null, output);
            } catch (SQLException error) {
                System.out.println("SQL Error: " + error.getMessage());
            }
        }

        if (e.getSource() == buttonRegistar) {
            //Se valida que no haya ninguna casilla vacia
            if (!idEmpleadoField.getText().isEmpty() && !extensionField.getText().isEmpty() && consentRadioButton.isSelected()) {
                System.out.println("Se entro a registrar");
                String id_empleado = idEmpleadoField.getText();
                String extension = extensionField.getText();
                String tipo_cargo = cargoComboBox.getSelectedItem().toString();

                int resultado = contratos.addContrato(id_empleado, extension, tipo_cargo);
                System.out.println(resultado);

                if (resultado == 1) {
                    JOptionPane.showMessageDialog(null, "Se ha registrado con éxito " + resultado);
                    idEmpleadoField.setText("");
                    extensionField.setText("");
                    cargoComboBox.setSelectedItem("Escoge una opcion");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar, Intente de nuevo");
                }
            }
        }else if (!consentRadioButton.isSelected()) {
            JOptionPane.showMessageDialog(null, "Sin previa firma el contrato no puede ser dado de alta");
        } else {
            JOptionPane.showMessageDialog(null, "Faltan casillas por llenar");
        }
    }
}
