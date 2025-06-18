package q62;

public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(int dia, int mes, int ano, String hora, String evento) {
        super(dia, mes, ano, hora);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return  "evento = " + evento + super.toString();
    }
    
}
