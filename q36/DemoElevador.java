package lista.q36;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador n1 = new Elevador(3, 10);

        n1.entra();
        n1.entra();
        n1.entra();
        //n1.entra();
        //n1.entra();
        // n1.sai();
        // n1.sai();
        // n1.sai();
        // n1.sai();
        n1.sobe(10);
        n1.desce(5);
        System.out.println(n1);
    }
}
