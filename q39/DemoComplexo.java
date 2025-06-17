package lista.q39;

public class DemoComplexo {
    public static void main(String[] args) {
        Complexo c1 = new Complexo(2, 3);
        Complexo c2 = new Complexo(4);
        Complexo c3 = new Complexo();

        System.out.println("Número complexo 1: " + c1);
        System.out.println("Número complexo 2: " + c2);
        System.out.println("Número complexo 3: " + c3);

        c3.setParteReal(5);
        c3.setParteImaginaria(6);
        System.out.println("Número complexo 3 atualizado: " + c3);
    }
}
