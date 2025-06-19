package q37;

public class DemoContador {
    public static void main(String[] args) {
        Contador c1 = new Contador();

        c1.incrementar();
        System.out.println(c1);
        c1.zerar();
        System.out.println(c1);
        c1.incrementar();
        c1.incrementar(3);
        System.out.println(c1);
    }
}
