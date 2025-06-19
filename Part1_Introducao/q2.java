package Part1_Introducao;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2,n3;
        System.out.println("Soma e media aritmetrica entre 3 numeros");
        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextFloat();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        n3 = sc.nextFloat();
        System.out.println("A soma entre eles eh: " + (n1+n2+n3));
        System.out.println("A media entre eles eh: " + ((n1+n2+n3)/3));
        sc.close();
    }
}
