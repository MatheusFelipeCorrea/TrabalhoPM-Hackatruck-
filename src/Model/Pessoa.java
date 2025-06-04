package src.Model;

public abstract class Pessoa {
    protected String nomePessoa;
    protected String cpf;
    protected Instituicao instituicao;

    public Pessoa(String nomePessoa, String cpf, Instituicao instituicao) {
        this.nomePessoa = nomePessoa;
        this.cpf = cpf;
        this.instituicao = instituicao;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }
}



