package q73_74;

public class DemoGeometrica {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Quadrado quadrado = new Quadrado();
        Desenho d1 = new Desenho(circulo, 2, 5, quadrado, 9, 10);
        Desenho d2 = new Desenho(quadrado, 7, 8, triangulo, 5, 3);
        d1.apresenta();
        System.out.println();
        d2.apresenta();

    }
}
