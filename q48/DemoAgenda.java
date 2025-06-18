package q48;
public class DemoAgenda {
    public static void main(String[] args) {
        Agenda a = new Agenda();
        a.adicionarCompromisso(new EntradaEmAgenda(1, 2, 3, 4, "Teste"));
        a.adicionarCompromisso(new EntradaEmAgenda(15, 16, 5, 2001, "Teste2"));
        a.listaDia(16, 5, 2001);
    }
}
