package src.Controller;



import src.Model.Equipe;
import src.Model.Profissional;
import src.Model.Projeto;

public class ProjetoController {

    public Projeto criarProjeto(Profissional orientador, Equipe equipe, String titulo, String descricao) {
        return new Projeto(orientador, equipe, titulo, descricao);
    }
}
