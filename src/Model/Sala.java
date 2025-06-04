package src.Model;


public class Sala {
    private String numero;
    private int capacidade;

    public Sala(String numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public String getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }
}

