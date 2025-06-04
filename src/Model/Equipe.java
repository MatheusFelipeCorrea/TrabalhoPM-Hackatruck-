package src.Model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nomeEquipe;
    private List<Estudante> membros;

    public Equipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
        this.membros = new ArrayList<>();
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public List<Estudante> getMembros() {
        return membros;
    }

    public void adicionarMembro(Estudante e) {
        membros.add(e);
    }
}
