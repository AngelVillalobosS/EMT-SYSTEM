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
    private JLabel labelNombreEmpresa;
    private JTextField nombreEmField;
    private JTextField rfcField;
    private JLabel labelRFC;
    private JButton botonRegistrar;
    private JButton buttonMostrar;
    private JLabel LabelTelefono;
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

    public JPanel getJDatosEmpr()
    {
        return JDatosEmp;
    }

    datosEmp()
    {
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
            System.exit(0);
        }

        if(e.getSource() == botonRegistrar)
        {
            int id = textFieldID.getColumns();
            String Ads = textFieldAdscripcion.getText();
            int lada = textFieldLada.getColumns();
            int tel = textFieldTelEmpl.getColumns();
            String puesto = textFielPuesto.getText();

            String nomEmp = nombreEmField.getText();
            String telEmp = textFieldTelefonoE.getText();
            String rfc = rfcField.getText();

            datosE.setAdscripcion(Ads);
            //empleado.setTelefonoExtension(String.id, lada);
            //datosE.
            datosE.setPuesto(puesto);
            empresa = new Empresa(nomEmp, rfc);
            empresa.setTelefono(telEmp);

        }

        if(e.getSource() == buttonMostrar)
        {

        }
    }
}