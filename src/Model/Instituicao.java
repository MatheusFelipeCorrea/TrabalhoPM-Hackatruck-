package src.Model;



public abstract class Instituicao {
    protected String nomeInstituicao;

    public Instituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }
}


