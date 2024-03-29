package gestor.empresarial.datos;

public final class DatosEmpresariales extends DatosPersonales{
    private String adscripcion;
    private String telefonoExterior;
    private String puesto;

    public DatosEmpresariales(int id, String nombre, String apellidos, String correo){

    }

    String getAdscripcion() {
        return adscripcion;
    }

    void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    String getTelefonoExterior() {
        return telefonoExterior;
    }

    void setTelefonoExterior(String telefonoExterior) {
        this.telefonoExterior = telefonoExterior;
    }

    String getPuesto() {
        return puesto;
    }

    void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
