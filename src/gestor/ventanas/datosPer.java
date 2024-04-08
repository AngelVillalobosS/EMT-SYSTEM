package gestor.ventanas;

import javax.swing.*;
import java.awt.*;
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

    private JButton buttonMenu;
    private JList list1;

    public JPanel getJDatosPer()
    {
        return JDatosPer;
    }

    datosPer()
    {

        buttonMenu.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == buttonMenu)
        {
            super.dispose();
        }
        
    }
    private void mostrarMenu()
    {
        JFrame frame = new JFrame("MENU");
        Dimension tamaño = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamaño.width / 2) -200;
        int y = (tamaño.height / 2) -150;

        Menu menu = new Menu();

        frame.setContentPane(menu.getJMenu());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(700,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
