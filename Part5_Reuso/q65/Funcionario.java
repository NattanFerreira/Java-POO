package q65;

public class Funcionario {
    private final String nome;
    private float salario;
    
    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public float aumentarSalario(float valor){
        salario += valor;
        return salario;
    }
    public float ganhoAnual(){
        return salario*13;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", salario = " + salario;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

}
