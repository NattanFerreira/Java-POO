package Part1_Introducao;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos, dias, horas;
        System.out.println("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();
        horas = minutos/60;
        dias = horas/24;
        System.out.println(minutos + " minutos sao equivalentes a: " + dias + " dia(s) " + horas%24 + " hora(s) " + minutos%60 + " Minuto(s)");
        sc.close();
    }
}
