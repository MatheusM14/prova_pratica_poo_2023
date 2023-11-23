package prova;

import java.util.ArrayList;
import java.util.List;

public class Acidente {
    private Rodovia rodovia;
    private String mes;
    private int vitimasFatais;
    private List<Veiculo> veiculosEnvolvidos = new ArrayList<>();

    public Acidente() {
    }
    
    public Acidente(Rodovia rodovia, String mes, int vitimasFatais) {
        this.rodovia = rodovia;
        this.mes = mes;
        this.vitimasFatais = vitimasFatais;
    }

    public Rodovia getRodovia() {
        return rodovia;
    }

    public void setRodovia(Rodovia rodovia) {
        this.rodovia = rodovia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getVitimasFatais() {
        return vitimasFatais;
    }

    public void setVitimasFatais(int vitimasFatais) {
        this.vitimasFatais = vitimasFatais;
    }

    public List<Veiculo> getVeiculosEnvolvidos() {
        return veiculosEnvolvidos;
    }

    public void setVeiculosEnvolvidos(List<Veiculo> veiculosEnvolvidos) {
        this.veiculosEnvolvidos = veiculosEnvolvidos;
    }
}