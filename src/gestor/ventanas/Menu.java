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
        }

        if(e.getSource() == datosEmpresarialesButton)
        {
            mostarDatosEmpresariales();
        }

        if(e.getSource() == contratosButton)
        {
            mostarContratos();
        }

        if(e.getSource() == buttonClose)
        {
            System.exit(0);
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
        //venDatosPer.pack();
        venDatosPer.setSize(700,500);
        venDatosPer.setLocationRelativeTo(null);
        venDatosPer.setVisible(true);
        dispose();
    }

    private void mostarDatosEmpresariales()
    {
        JFrame venDatosEmp = new JFrame("DATOS EMPRESARIALES");
        Dimension tamaño = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamaño.width / 2) -200;
        int y = (tamaño.height / 2) -150;

        datosEmp datosEmp = new datosEmp();

        venDatosEmp.setContentPane(datosEmp.getJDatosEmp());
        venDatosEmp.setSize(700,500);
        venDatosEmp.setLocationRelativeTo(null);
        venDatosEmp.setVisible(true);

    }

    private void mostarContratos()
    {
    JFrame venContratos = new JFrame("Contratos");
    Dimension tamaño = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (tamaño.width / 2) -200;
    int y = (tamaño.height / 2) -150;

    contratos contratos = new contratos();

    venContratos.setContentPane(contratos.getJContratos());
   // venContratos.pack();
    venContratos.setSize(700,500);
    venContratos.setLocationRelativeTo(null);
    venContratos.setVisible(true);

    }
}
