package gestor.ventanas.empleados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusquedaEmpleados extends JFrame implements ActionListener
{
    private JButton botonMenu;
    private JButton botonBuscar;
    private JPanel JPanelEmp;
    private JTextField textField1;

    public BusquedaEmpleados()
    {

    }

    public JPanel getJPanelEmpr()
    {
        return JPanelEmp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
