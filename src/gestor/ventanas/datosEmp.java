package gestor.ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datosEmp extends JFrame implements ActionListener
{

    private JPanel JDatosEmp;
    private JLabel labelTitulo;
    private JButton botonMenu;
    private JLabel labelNombreEmpresa;
    private JTextField nombreEmField;
    private JTextField rfcField;
    private JLabel labelRFC;
    private JButton botonRegistrar;

    public JPanel getJDatosEmpr()
    {
        return JDatosEmp;
    }

    datosEmp()
    {
        botonMenu.addActionListener(this);
        botonRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == botonMenu)
        {
            System.exit(0);
        }
    }
}
