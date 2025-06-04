package src.Model;


import java.util.ArrayList;
import java.util.List;

public class ApresentacoesSingleton {
    private static ApresentacoesSingleton instancia;
    private List<Apresentacao> apresentacoes;

    private ApresentacoesSingleton() {
        apresentacoes = new ArrayList<>();
    }

    public static ApresentacoesSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ApresentacoesSingleton();
        }
        return instancia;
    }

    public void adicionar(Apresentacao ap) {
        apresentacoes.add(ap);
    }

    public List<Apresentacao> getApresentacoes() {
        return apresentacoes;
    }
}
