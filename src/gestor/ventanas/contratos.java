package gestor.ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.*;

public class contratos extends JFrame implements ActionListener
{

    private JPanel JContratos;
    private JLabel LabelContratos;
    private JButton buttonMenu;
    private JTextField textField1;
    private JLabel labelNoContrato;
    private JTextField textField2;
    private JLabel labelanno;
    private JTextField textField3;
    private JLabel labelCargo;
    private JComboBox comboBox1;
    private JButton buttonRegistar;

    public JPanel getJContratos()
    {
        return JContratos;
    }

    contratos()
    {
        buttonMenu.addActionListener(this);
        buttonRegistar.addActionListener(this);
        comboBox1.setModel(new DefaultComboBoxModel<>(Cargos.values()));
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
            JOptionPane.showMessageDialog(this,opcionCargo);

        }
    }
}
