package prova;

public class Rodovia {
    private String sigla;
    private String periculosidade;
    
    public Rodovia() {
    }
    
    public Rodovia(String sigla, String periculosidade) {
        this.sigla = sigla;
        this.periculosidade = periculosidade;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getPericulosidade() {
        return periculosidade;
    }

    public void setPericulosidade(String periculosidade) {
        this.periculosidade = periculosidade;
    }
}