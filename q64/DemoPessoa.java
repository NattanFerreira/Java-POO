package q64;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", 15);
        Politico p2 = new Politico("Alberto", 50, "PL");
        Prefeito p3 = new Prefeito("Jeane", 60, "PSL", "Alexandria");
        Governador p4 = new Governador("Fatima", 65, "PT", "RN");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
