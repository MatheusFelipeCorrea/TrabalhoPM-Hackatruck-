package src.Model;


public class Estudante extends Pessoa {
    private String matricula;

    public Estudante(String nomePessoa, String cpf, Instituicao instituicao, String matricula) {
        super(nomePessoa, cpf, instituicao);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
