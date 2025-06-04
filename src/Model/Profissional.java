package src.Model;

public class Profissional extends Pessoa {
    protected String cargo;

    public Profissional(String nomePessoa, String cpf, Instituicao instituicao, String cargo) {
        super(nomePessoa, cpf, instituicao);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
