package q40;

public class DemoMaior {
    public static void main(String[] args) {
        System.out.println("O maior entre 10 e 9 eh: " + MaiorValor.intMaior(10, 9));
        System.out.println("O maior entre 10, 9 e 15 eh: " + MaiorValor.intMaior(10, 9, 15));
        System.out.println("O maior entre 10, 9, 15 e 43 eh: " + MaiorValor.intMaior(10, 9, 15,43));
        System.out.println("O maior entre 100,9,12,21 e 44 eh: " + MaiorValor.intMaior(100, 9,12,21,44));

        System.out.println(MaiorValor.doubleMaior(1.3, 1.5));
        System.out.println(MaiorValor.doubleMaior(1.3, 1.5,2.3));
        System.out.println(MaiorValor.doubleMaior(1.3, 1.5, 8.6, 9.7));
        System.out.println(MaiorValor.doubleMaior(1.3, 1.7, 0.2, 9.4,5.1));
    }
}