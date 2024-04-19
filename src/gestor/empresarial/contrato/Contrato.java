package gestor.empresarial.contrato;

public class Contrato {
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo;

    public Contrato(int id, int noContrato, int annio) {
        this.noContrato = noContrato;
        this.annio=annio;
        this.id=id;
    }

//    public Contrato(int id){
//        tipoCargo = Cargos.confianza;
//    }

    public int getNoContrato() {
        return noContrato;
    }

    public void setNoContrato(int noContrato) {
        this.noContrato = noContrato;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public Cargos getCargo() {
        return tipoCargo;
    }

    public void setCargo(Cargos cargo) {
        this.tipoCargo = cargo;
    }
}