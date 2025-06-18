package q65;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, float salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + " matricula = " + matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    
}
