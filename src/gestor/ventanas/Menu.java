package gestor.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener
{
    private JPanel JMenu;
    private JLabel txtTitulo;
    private JButton buttonClose;
    private JButton datosPersonalesButton;
    private JButton datosEmpresarialesButton;
    private JButton contratosButton;

    Menu()
    {
        buttonClose.addActionListener(this);
        datosPersonalesButton.addActionListener(this);
        datosEmpresarialesButton.addActionListener(this);
        contratosButton.addActionListener(this);
    }

    public JPanel getJMenu()
    {
        return JMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == datosPersonalesButton)
        {
            mostarDatosPersonales();
            dispose();
        }

        if(e.getSource() == datosEmpresarialesButton)
        {
            mostarDatosEmpresariales();
            dispose();
        }

        if(e.getSource() == contratosButton)
        {

        }

        if(e.getSource() == buttonClose)
        {
            dispose();
        }
    }

    private void mostarDatosPersonales()
    {
        JFrame venDatosPer = new JFrame("DATOS PERSONALES");
        Dimension tamaño = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamaño.width / 2) -200;
        int y = (tamaño.height / 2) -150;

        datosPer datosPer = new datosPer();

        venDatosPer.setContentPane(datosPer.getJDatosPer());
        venDatosPer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        venDatosPer.setSize(700,500);
        venDatosPer.setLocationRelativeTo(null);
        venDatosPer.setVisible(true);

    }

    private void mostarDatosEmpresariales()
    {
        JFrame venDatosEmp = new JFrame("DATOS EMPRESARIALES");
        Dimension tamaño = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamaño.width / 2) -200;
        int y = (tamaño.height / 2) -150;

        datosEmp datosEmp = new datosEmp();

        venDatosEmp.setContentPane(datosEmp.getJDatosEmp());
        venDatosEmp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        venDatosEmp.setSize(700,500);
        venDatosEmp.setLocationRelativeTo(null);
        venDatosEmp.setVisible(true);

    }
}
