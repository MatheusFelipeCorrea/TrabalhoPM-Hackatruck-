package src.Model;

import java.time.LocalDateTime;

public class Apresentacao implements Avaliavel {
    private Projeto projeto;
    private Banca banca;
    private Sala sala;
    private LocalDateTime horario;

    public Apresentacao(Projeto projeto, Banca banca, Sala sala, LocalDateTime horario) {
        this.projeto = projeto;
        this.banca = banca;
        this.sala = sala;
        this.horario = horario;
    }

    @Override
    public double calcularNotaFinal() {
        return banca.calcularNotaFinal();
    }

    public Projeto getProjeto() {
        return projeto;
    }
}
