package gestor.ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datosPer extends JFrame implements ActionListener
{
    private JPanel JDatosPer;
    private JLabel labelId;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel labelName;
    private JLabel labeCorreo;
    private JButton buttonClose;
    private JButton buttonMenu;
    private JList list1;

    public JPanel getJDatosPer()
    {
        return getJDatosPer();
    }

    datosPer()
    {
        buttonClose.addActionListener(this);
        buttonMenu.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
