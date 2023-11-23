package prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartamentoTransito {
	private List<Rodovia> rodovias = new ArrayList<>();
    private List<Acidente> acidentes = new ArrayList<>();

   
    public void cadastrarRodovia(String sigla, String periculosidade) {
        Rodovia rodovia = new Rodovia(sigla, periculosidade);
        rodovias.add(rodovia);
    }  

   
    public void cadastrarAcidente(Acidente acidente) {
        acidentes.add(acidente);
    } 
    public Rodovia rodoviaComMaisAcidentesComBicicletas() {
        Map<Rodovia, Integer> contagemBicicletas = new HashMap<>();

        for (Acidente acidente : acidentes) {
            for (Veiculo veiculo : acidente.getVeiculosEnvolvidos()) {
                if (veiculo instanceof Bicicleta) {
                    contagemBicicletas.put(acidente.getRodovia(), contagemBicicletas.getOrDefault(acidente.getRodovia(), 0) + 1);
                }
            }
        }

        return contagemMaxima(contagemBicicletas);
    }  
    
    public Rodovia rodoviaComMaisAcidentesComVitimasFatais() {
        Map<Rodovia, Integer> contagemVitimasFatais = new HashMap<>();

        for (Acidente acidente : acidentes) {
            contagemVitimasFatais.put(acidente.getRodovia(), contagemVitimasFatais.getOrDefault(acidente.getRodovia(), 0) + acidente.getVitimasFatais());
        }

        return contagemMaxima(contagemVitimasFatais);
    } 
    
    public int quantidadeAcidentesComVeiculosNovos() {
        int quantidade = 0;
        for (Acidente acidente : acidentes) {
            for (Veiculo veiculo : acidente.getVeiculosEnvolvidos()) {
                if (veiculo.getAnoFabricacao() == 2013) {
                    quantidade++;
                    break; 
                }
            }
        }
        return quantidade;
    }

   
    public List<Rodovia> rodoviasComAcidentesNoCarnaval() {
        List<Rodovia> rodoviasCarnaval = new ArrayList<>();

        for (Acidente acidente : acidentes) {
            if (acidente.getMes().equals("fevereiro")) {
                rodoviasCarnaval.add(acidente.getRodovia());
            }
        }

        return rodoviasCarnaval;
    }
   
    private <K> K contagemMaxima(Map<K, Integer> contagem) {
        return Collections.max(contagem.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
