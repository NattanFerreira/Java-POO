package lista.q48;

import java.util.ArrayList;

public class Agenda {
    private final ArrayList<EntradaEmAgenda> listaDeCompromisso;

    public Agenda() {
        listaDeCompromisso = new ArrayList<>();
    }
    public void adicionarCompromisso(EntradaEmAgenda compromisso){
        listaDeCompromisso.add(compromisso);
    }
    public void listaDia(int dia, int mes, int ano){
        for (EntradaEmAgenda entradaEmAgenda : listaDeCompromisso) {
            if (entradaEmAgenda.ehNoDia(dia, mes, ano)){
                System.out.println(entradaEmAgenda);
            }
        }
    }
}
