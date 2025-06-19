package Part1_Introducao;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Digite o primeiro numero");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo numero");
        n2 = sc.nextDouble();
        System.out.println("Digite o terceiro numero");
        n3 = sc.nextDouble();
        if(n1 > n2){
            n1 = n2;
        }
        System.out.println("O menor numero eh: " + Math.min(n1, n3));
        sc.close();
    }
}
