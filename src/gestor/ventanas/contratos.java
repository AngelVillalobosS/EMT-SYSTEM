package gestor.ventanas;

import gestor.empresarial.contrato.Contrato;
import gestor.empresarial.empleados.Empleados;
import gestor.empresarial.empresa.Empresa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contratos extends JFrame implements ActionListener
{

    private JPanel JContratos;
    private JLabel LabelContratos;
    private JButton buttonMenu;
    private JTextField textFieldNombreEm;
    private JLabel labelTelfonoEm;
    private JTextField textFieldTelfono;
    private JLabel labelRFC;
    private JTextField textFieldRFC;
    private JLabel labelCargo;
    private JComboBox comboBox1;
    private JButton buttonRegistar;
    private JRadioButton radioButton1;
    private Contrato contrato;
    private Empleados empleado;
    private Empresa empresa;


    public JPanel getJContratos()
    {
        return JContratos;
    }

    contratos()
    {
        buttonMenu.addActionListener(this);
        buttonRegistar.addActionListener(this);
        comboBox1.setModel(new DefaultComboBoxModel<>(Cargos.values()));
        //contrato = new Contrato(0);
        empleado = new Empleados();

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == buttonMenu)
        {
            System.exit(0);
        }

        if (e.getSource() == buttonRegistar)
        {
            String nombreEm = textFieldNombreEm.getText();
            String telefono = textFieldTelfono.getText();
            String rfc = textFieldRFC.getText();
            Cargos cargo = (Cargos) comboBox1.getSelectedItem();
            String opcionCargo = cargo.toString();
            //empleado.setCargo();

            empresa = new Empresa(nombreEm, rfc);
            empresa.setTelefonoE(telefono);




        }
    }
}
