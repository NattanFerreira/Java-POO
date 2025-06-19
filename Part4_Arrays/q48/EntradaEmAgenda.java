package q48;

public class EntradaEmAgenda {
    private final int hora, dia, mes, ano;
    private final String assunto;
    
    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        return dia == this.dia && mes == this.mes && ano == this.ano;
    }


    @Override
    public String toString() {
        return "hora = " + hora + " dia = " + dia + ", mes = " + mes + ", ano = " + ano + ", assunto = " + assunto;
    }
    
}
