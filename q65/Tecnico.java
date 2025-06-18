package q65;

public class Tecnico extends Assistente {
    private final float bonusSalarial;

    public Tecnico(String nome, float salario, int matricula, float bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
        aumentarSalario(bonusSalarial);
    }

    @Override
    public String toString() {
        return super.toString() + " bonusSalarial = " + bonusSalarial;
    }
    
}
