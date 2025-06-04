package src.Model;
import java.util.ArrayList;
import java.util.List;

public class Universidade extends Instituicao {
    private String cnpj;
    private List<Pessoa> pessoas;

    public Universidade(String nomeInstituicao, String cnpj) {
        super(nomeInstituicao);
        this.cnpj = cnpj;
        this.pessoas = new ArrayList<>();
    }

    public void novaUniversidade(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }
}

