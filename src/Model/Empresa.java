package src.Model;
import java.util.ArrayList;
import java.util.List;


public class Empresa extends Instituicao {
    private String cnpj;
    private List<Pessoa> pessoas;

    public Empresa(String nomeInstituicao, String cnpj) {
        super(nomeInstituicao);
        this.cnpj = cnpj;
        this.pessoas = new ArrayList<>();
    }

    public void novaEmpresa(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }
}


