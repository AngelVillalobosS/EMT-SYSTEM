package gestor.ventanas;

import gestor.empresarial.contrato.Contrato;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.empleados.Empleados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contratos extends JFrame implements ActionListener
{

    private JPanel JContratos;
    private JLabel LabelContratos;
    private JButton buttonMenu;
    private JTextField textFieldID;
    private JLabel labelNoContrato;
    private JTextField textFieldNumero;
    private JLabel labelanno;
    private JTextField textFieldAnno;
    private JLabel labelCargo;
    private JComboBox comboBox1;
    private JButton buttonRegistar;
    private Contrato contrato;
    private Empleados empleado;


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
            Cargos cargo = (Cargos) comboBox1.getSelectedItem();
            String opcionCargo = cargo.toString();
            //empleado.setCargo();
            //JOptionPane.showMessageDialog(this,opcionCargo);

            int numeroContrato = textFieldNumero.getColumns();
            contrato.setNoContrato(numeroContrato);

            int anno = textFieldAnno.getColumns();
            contrato.setNoContrato(anno);

            String id = textFieldID.getText();


        }
    }
}
