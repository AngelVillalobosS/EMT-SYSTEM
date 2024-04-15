package gestor.ventanas;

public enum Cargos

{
    confianza("Empleado de Confianza"),
    sindicalizado("Empleado sindicalizado"),
    temporal("Empleado temporal");


    private final String nombre;

    Cargos(String nombre)
    {
        this.nombre = nombre;
    }


    @Override
    public String toString()
    {
        return nombre;
    }
}
