package gestor.empresarial.datos;


public final class DatosEmpresariales extends DatosPersonales{
    private String adscripcion;
    private String telefonoExterior;
    private String puesto;

    public DatosEmpresariales(int id, String nombre, String apellidos, String correo){
        super.setId(id);
        super.setNombre(nombre);
        super.setApellidos(apellidos);
        super.setCorreo(correo);
    }


    public String getAdscripcion() {
        return adscripcion;
    }

    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    public String getTelefonoExterior() {
        return telefonoExterior;
    }

    public void setTelefonoExterior(String telefonoExterior) {
        this.telefonoExterior = telefonoExterior;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
