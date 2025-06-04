package src.Controller;

import src.Model.*;
import java.time.LocalDateTime;

public class ApresentacaoController {

    public Apresentacao criarApresentacao(Projeto projeto, Banca banca, Sala sala, LocalDateTime horario) {
        Apresentacao apresentacao = new Apresentacao(projeto, banca, sala, horario);
        ApresentacoesSingleton.getInstancia().adicionar(apresentacao);
        return apresentacao;
    }

    public void avaliarProjeto(Apresentacao apresentacao) {
        double nota = apresentacao.calcularNotaFinal();
        apresentacao.getProjeto().setNotaFinal(nota);
    }
}
