package gestor.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Inicio extends JFrame implements ActionListener
{
    private JPanel panelInicio;
    private JButton Cerrar;
    private JLabel LUser;
    private JTextField textUser;
    private JLabel labelPassword;
    private JButton buttonLogin;
    private JPasswordField password;
    private JTextField textPassword;

    public Inicio ()
    {
        buttonLogin.addActionListener(this);
        Cerrar.addActionListener(this);
    }

    public JPanel getPanelInicio()
    {
        return panelInicio;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == buttonLogin)
        {
            String user = textUser.getText();
            String pass = new String(password.getPassword());

            if(user.equals("admin") && pass.equals("2003"))
            {
                JOptionPane.showMessageDialog(null, "BIENVENIDO");
                mostrarMenu();
                dispose();
            }else
            {
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTOS");
            }
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
