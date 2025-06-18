package q61;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento e = new Equipamento(220, true);
        Computador c = new Computador(110, false, 3500.0, false);

        System.out.println(e);
        System.out.println(c);
    }
}
