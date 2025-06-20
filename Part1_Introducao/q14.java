package Part1_Introducao;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTermos, nAnterior, termo;
        int aux = 1;
        System.out.println("Digite o n-ezimo termo da sequencia de fibonacci: ");
        nTermos = sc.nextInt();
        nAnterior = 0;
        System.out.print(nAnterior);
        System.out.print(" " + aux);
        termo = aux + nAnterior;
        for (int i = 0; i < nTermos - 2; i++) {
            System.out.print(" " + termo);
            nAnterior = termo;
            termo = nAnterior + aux;
            aux = nAnterior;
        }
        sc.close();
    }
}
