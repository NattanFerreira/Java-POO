package Part2_Classes1.q31;

public class DemoFatura {
    public static void main(String[] args) {
        Fatura f1 = new Fatura(1, 3, "Comida", 120);
        Fatura f2 = new Fatura(2, 12, "Cinema", -5);
        Fatura f3 = new Fatura(3, -7, "Lazer", 50);

        System.out.println(f1.valorTotal());
        System.out.println(f2.valorTotal());
        System.out.println(f3.valorTotal());
    }
}
