package gestor.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class datosPer extends JFrame implements ActionListener
{
    private JPanel JDatosPer;
    private JLabel labelId;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel labelName;
    private JLabel labeCorreo;
    private JButton buttonRegistrar;
    private JButton buttonMenu;
    private JList list1;

    public JPanel getJDatosPer()
    {
        return JDatosPer;
    }

    datosPer()
    {
        buttonRegistrar.addActionListener(this);
        buttonMenu.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == buttonMenu)
        {
            dispose();
        }

        if(e.getSource() == buttonRegistrar)
        {

        }
        
    }
}
