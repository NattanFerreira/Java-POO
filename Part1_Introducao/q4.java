package Part1_Introducao;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double centigrados, fahren;
        System.out.println("Digite os graus centigrados: ");
        centigrados = sc.nextDouble();
        fahren = (centigrados * 9/5) + 32;
        System.out.println(centigrados + " Centrigrados = " + fahren + " Fahrenheit");
    }
}