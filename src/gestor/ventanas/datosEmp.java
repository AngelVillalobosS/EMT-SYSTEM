package gestor.ventanas;

import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.empleados.Empleados;
import gestor.empresarial.empresa.Empresa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datosEmp extends JFrame implements ActionListener
{

    private JPanel JDatosEmp;
    private JLabel labelTitulo;
    private JButton botonMenu;
    private JTextField nombreEmField;
    private JTextField rfcField;
    private JButton botonRegistrar;
    private JButton buttonMostrar;
    private JTextField textFieldTelefonoE;
    private JLabel LabelId;
    private JTextField textFieldID;
    private JLabel LabelAdscripcion;
    private JTextField textFieldAdscripcion;
    private JLabel LabelLada;
    private JTextField textFieldLada;
    private JLabel labelTelEmp;
    private JTextField textFieldTelEmpl;
    private JLabel labelPuesto;
    private JTextField textFielPuesto;
    private DatosEmpresariales datosE;
    private Empleados empleado;
    private Empresa empresa;

    private JMenu menu;
    private DatosEmpresariales datosEmpleado;

    public JPanel getJDatosEmpr()
    {
        return JDatosEmp;
    }

    public datosEmp()
    {
        menu = new JMenu();
        datosEmpleado = new DatosEmpresariales(12,"a", "23131", "231");
        botonMenu.addActionListener(this);
        botonRegistrar.addActionListener(this);
        //datosE = new DatosEmpresariales(2,"x" , "x", "x");
        empleado = new Empleados();
        empresa = new Empresa("x", "x");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == botonMenu)
        {
            JMenu nuevoMenu = new JMenu();
            nuevoMenu.setVisible(true);
            this.dispose();
        }

        if(e.getSource() == botonRegistrar)
        {
            String id = textFieldID.getText();
            String Ads = textFieldAdscripcion.getText();
            String lada = textFieldLada.getText();
            String tel = textFieldTelEmpl.getText();
            String puesto = textFielPuesto.getText();

            String nomEmp = nombreEmField.getText();
            String telEmp = textFieldTelefonoE.getText();
            String rfc = rfcField.getText();

            empleado.setAdscripcion(id,Ads);
            empleado.setTelefonoExtension(id, lada);
            empleado.setWhatsapp(Integer.parseInt(id), tel);
            empleado.setPuesto(id, puesto);

            new Empresa(nomEmp,rfc);
            empresa.setTelefonoE(telEmp);
        }

        if(e.getSource() == buttonMostrar)
        {
            System.out.println("Has clickeado Mostrar");
            String id = textFieldID.getText();


        }
    }
}