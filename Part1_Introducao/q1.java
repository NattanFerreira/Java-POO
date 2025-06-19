package Part1_Introducao;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float lado;
        System.out.println("Digite o valor do lado do quadrado");
        lado = sc.nextFloat();
        System.out.println("A area do quadrado eh: " + lado*lado);
        sc.close();
    }
}
