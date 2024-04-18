package gestor.empresarial.datos;


public final class DatosEmpresariales extends Aspirante {
    private String adscripcion;
    private String telefonoExterior;
    private String puesto;

    public DatosEmpresariales(String id, String adscripcion, String telefonoExterior, String puesto){
        super(id);
        super.setId(id);
        super.setNombre(adscripcion);
        super.setApellidos(telefonoExterior);
        super.setCorreo(puesto);
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
