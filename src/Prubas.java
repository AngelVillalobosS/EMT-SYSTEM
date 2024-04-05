import gestor.ventanas.Inicio;

import javax.swing.*;
import java.awt.*;

public class Prubas
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("EMT-SYSTEM");
        Dimension tamaño = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamaño.width / 2) -300;
        int y = (tamaño.height / 2) -250;

        Inicio incio = new Inicio();

        frame.setContentPane(incio.getPanelInicio());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 500);
        frame.setLocation(x, y);
        frame.setVisible(true);


    }
}
