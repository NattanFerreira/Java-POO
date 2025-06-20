package q72;

public class Funcionario {
    private final String nome;
    private final float salarioHora;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioHora = 2.0F;
    }

    public Funcionario(String nome, float salarioHora) {
        this.nome = nome;
        this.salarioHora = salarioHora;
    }

    public String getNome() {
        return nome;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", salarioHora=" + salarioHora;
    }
}
