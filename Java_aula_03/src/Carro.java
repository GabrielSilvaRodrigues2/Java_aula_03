public class Carro {

    private String idCarro;
    private String nomeCarro;
    private String numeroPortas;

    public Carro(String idCarro, String nomeCarro, String numeroPortas) {
        this.idCarro = idCarro;
        this.nomeCarro = nomeCarro;
        this.numeroPortas = numeroPortas;
    }

    public String getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(String idCarro) {
        this.idCarro = idCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(String numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

}