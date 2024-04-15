package gestor.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.System.*;


public class Inicio extends JFrame implements ActionListener
{
    private JPanel panelInicio;
    private JButton buttonCerrar;
    private JLabel LUser;
    private JTextField textUser;
    private JLabel labelPassword;
    private JButton buttonLogin;
    private JPasswordField password;
    private JLabel Imagen;

    public Inicio() {
        buttonLogin.addActionListener(this);
        buttonCerrar.addActionListener(this);
    }

    public JPanel getPanelInicio() {
        return panelInicio;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonLogin) {
            String user = textUser.getText();
            String pass = new String(password.getPassword());

            if (user.equals("admin") && pass.equals("2003")) {
                JOptionPane.showMessageDialog(null, "BIENVENIDO");
                mostrarMenu();

            } else {
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTOS");
            }
        } else if (e.getSource() == buttonCerrar) {
           System.exit(0);
        }
    }



    private void mostrarMenu() {
        JFrame frame = new JFrame("MENU");

        Menu menu = new Menu();

        frame.setContentPane(menu.getJMenu());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}