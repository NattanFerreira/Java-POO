package Part1_Introducao;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] dias = {"Domingo","Segunda-Feira","Terca-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sabado"};
        int numero;

        do{
            System.out.println("Digite um dia de fevereiro (1-28)");
            numero = sc.nextInt();
        } while(numero < 1 || numero > 28);

        for (int i = 0; i < 28; i++) {
            if(numero == (i+1)){
                System.out.println("O dia " + numero + " sera uma " + dias[i%7]);
            }
        }
        sc.close();
    }
}