import gestor.archivos.*;
import gestor.ventanas.Login;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("EMT-SYSTEM | Login");
        Dimension tamannio = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamannio.width / 2) -300;
        int y = (tamannio.height / 2) -250;

        Login incio = new Login();

        frame.setContentPane(incio.getPanelInicio());
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(x, y);
        frame.setVisible(true);
    }
}