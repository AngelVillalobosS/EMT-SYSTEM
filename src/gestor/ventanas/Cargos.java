package gestor.ventanas;

public enum Cargos

{
    CONFIANZA("De confianza")  ,
    SINDICALIZADO("Sindicalizado"),
    TEMPORAL("Contrato Temporal");


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
