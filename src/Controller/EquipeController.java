package src.Controller;



import src.Model.Equipe;
import src.Model.Estudante;
import src.Model.EquipesSingleton;

public class EquipeController {

    public Equipe criarEquipe(String nomeEquipe) {
        Equipe equipe = new Equipe(nomeEquipe);
        EquipesSingleton.getInstancia().adicionarEquipe(equipe);
        return equipe;
    }

    public void adicionarEstudante(Equipe equipe, Estudante estudante) {
        equipe.adicionarMembro(estudante);
    }
}


