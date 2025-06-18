package q62;

public class EventoDelegacao{
    private String evento;
    private DataHora dataHora;

    public EventoDelegacao(int dia, int mes, int ano, String hora, String evento ) {
        this.dataHora = new DataHora(dia, mes, ano, hora);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "evento = " + evento + " "+ dataHora;
    }

    

}
