package Part7_Colecoes.q96;

public class Paciente {
    private final int rg, idade;

    public Paciente(int rg, int idade) {
        this.rg = rg;
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Paciente [rg=" + rg + ", idade=" + idade + "]";
    }

    
    

}
