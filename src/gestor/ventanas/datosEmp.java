package gestor.ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datosEmp extends JFrame implements ActionListener
{

    private JPanel JDatosEmp;
    private JLabel labelTitulo;
    private JButton buttonMenu;
    private JLabel labelNombreEmpresa;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel labelRFC;
    private JButton buttonRegistrar;

    public JPanel getJDatosEmp()
    {
        return JDatosEmp;
    }

    datosEmp()
    {
        buttonMenu.addActionListener(this);
        buttonRegistrar.addActionListener(this);
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
