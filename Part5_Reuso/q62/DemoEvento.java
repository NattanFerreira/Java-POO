package q62;

public class DemoEvento {
    public static void main(String[] args) {
        EventoDelegacao evento1 = new EventoDelegacao(2, 05, 2025, "15h", "aniversario");
        EventoHeranca evento2 = new EventoHeranca(5, 8, 2025, "18h", "casamento");

        System.out.println(evento1);
        System.out.println(evento2);
    }
}
