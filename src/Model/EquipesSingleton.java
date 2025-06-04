package src.Model;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EquipesSingleton {
    private static EquipesSingleton instancia;
    private List<Equipe> equipes;

    private EquipesSingleton() {
        equipes = new ArrayList<>();
    }

    public static EquipesSingleton getInstancia() {
        if (instancia == null) {
            instancia = new EquipesSingleton();
        }
        return instancia;
    }

    public void adicionarEquipe(Equipe e) {
        equipes.add(e);
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public List<Projeto> listarProjetosAprovados() {
        return ApresentacoesSingleton.getInstancia().getApresentacoes().stream()
                .map(Apresentacao::getProjeto)
                .filter(Projeto::isAprovado)
                .collect(Collectors.toList());
    }
}
