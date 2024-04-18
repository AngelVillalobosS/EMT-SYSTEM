package gestor.ventanas;

import javax.swing.*;
import java.awt.event.*;
import gestor.ventanas.Menu;
public class Login extends JFrame implements ActionListener
{
    private JPanel panelInicio;
    private JButton buttonCerrar;
    private JLabel LUser;
    private JTextField usuarioTexto;
    private JLabel labelPassword;
    private JButton buttonLogin;
    private JPasswordField passwordText;
    private JLabel Imagen;

    public Login() {
        buttonLogin.addActionListener(this);
        buttonCerrar.addActionListener(this);
    }

    public JPanel getPanelInicio() {
        return panelInicio;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonLogin) {
            String user = usuarioTexto.getText();
            String pass = new String(passwordText.getPassword());

            if (user.equals("admin") && pass.equals("2003") || user.equals("RH") && pass.equals("emt")) {
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