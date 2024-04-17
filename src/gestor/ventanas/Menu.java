package gestor.ventanas;

import gestor.ventanas.empleados.BusquedaEmpleados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gestor.ventanas.empleados.AnniadirEmpleados;

public class Menu extends JFrame implements ActionListener
{
    private JPanel JMenu;
    private JLabel txtTitulo;
    private JButton buttonClose;
    private JButton datosPersonalesButton;
    private JButton datosEmpresarialesButton;
    private JButton contratosButton;
    private JButton botonEmpleados;

    Menu()
    {
        buttonClose.addActionListener(this);
        datosPersonalesButton.addActionListener(this);
        botonEmpleados.addActionListener(this);
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

        if(e.getSource() == botonEmpleados){
            mostrarEmpleados();
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
        Dimension tamannio = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamannio.width / 2) -200;
        int y = (tamannio.height / 2) -150;

        datosPer datosPer = new datosPer();

        venDatosPer.setContentPane(datosPer.getJDatosPer());
        venDatosPer.setSize(900,500);

        venDatosPer.setLocationRelativeTo(null);
        venDatosPer.setVisible(true);
    }

    private void mostrarEmpleados(){
        JFrame ventEmpleados = new JFrame("EMPLEADOS");
        Dimension tamannio = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamannio.width / 2) - 200;
        int y = (tamannio.height / 2) - 150;

        AnniadirEmpleados empleados = new datosEmp();

        ventEmpleados.setContentPane(datosEmp.getJDatosEmpr());
    }

    private void mostarDatosEmpresariales()
    {
        JFrame venDatosEmp = new JFrame("DATOS EMPRESARIALES");
        Dimension tamannio = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamannio.width / 2) -200;
        int y = (tamannio.height / 2) -150;

        datosEmp datosEmp = new datosEmp();

        venDatosEmp.setContentPane(datosEmp.getJDatosEmpr());
        venDatosEmp.setSize(700,500);
        venDatosEmp.setLocationRelativeTo(null);
        venDatosEmp.setVisible(true);

    }

    private void mostarContratos()
    {
        JFrame venContratos = new JFrame("Contratos");
        Dimension tamannio = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamannio.width / 2) -200;
        int y = (tamannio.height / 2) -150;

        contratos contratos = new contratos();

        venContratos.setContentPane(contratos.getJContratos());
        venContratos.setSize(700,500);
        venContratos.setLocationRelativeTo(null);
        venContratos.setVisible(true);

    }
}
