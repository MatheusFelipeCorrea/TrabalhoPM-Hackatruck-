package src.Model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banca {
    private List<Jurado> jurados;
    private Map<Jurado, Integer> notas;

    public Banca() {
        this.jurados = new ArrayList<>();
        this.notas = new HashMap<>();
    }

    public void adicionarJurado(String nomePessoa, Instituicao instituicao, String cargo, String cpf) {
        Jurado j = new Jurado(nomePessoa, cpf, instituicao, cargo);
        jurados.add(j);
    }

    public void setNota(Jurado jurado, int nota) {
        notas.put(jurado, nota);
    }

    public double calcularNotaFinal() {
        if (notas.isEmpty()) return 0;
        return notas.values().stream().mapToDouble(n -> n).average().orElse(0);
    }

    public List<Jurado> getJurados() {
        return jurados;
    }
}


