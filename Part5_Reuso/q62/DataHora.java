package q62;

public class DataHora {
    private final int dia, mes, ano;
    private final String hora;

    public DataHora(int dia, int mes, int ano, String hora) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return " dia = " + dia + ", mes = " + mes + ", ano = " + ano + ", hora = " + hora;
    }

}
