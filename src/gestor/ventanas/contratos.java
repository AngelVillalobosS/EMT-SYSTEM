package gestor.ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == buttonMenu)
        {
            System.exit(0);
        }
    }
}
