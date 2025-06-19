package q64;

public class Governador extends Politico{
    private final String estado;

    public Governador(String nome, int idade, String partido, String estado) {
        super(nome, idade, partido);
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() + " estado = " + estado;
    }
}
