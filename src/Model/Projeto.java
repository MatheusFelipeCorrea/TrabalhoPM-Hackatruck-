package src.Model;

public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private String descricao;
    private String titulo;
    private double notaFinal;
    private boolean aprovado;

    public Projeto(Profissional orientador, Equipe equipe, String titulo, String descricao) {
        this.orientador = orientador;
        this.equipe = equipe;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
        this.aprovado = notaFinal >= 7.0;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String getTitulo() {
        return titulo;
    }
}
