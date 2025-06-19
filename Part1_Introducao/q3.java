package Part1_Introducao;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        double grau, radiano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um angulo em graus: ");
        grau = sc.nextDouble();
        radiano = Math.toRadians(grau);
        double cossec = 1/Math.sin(radiano);
        double sec = 1/Math.cos(radiano);
        double cotg = (Math.cos(radiano)/Math.sin(radiano));
        System.out.println(grau + " Graus em radianos eh: " + radiano);
        System.out.println("Sen:" + Math.sin(radiano) + " Cos: " + Math.cos(radiano) + " Tg: " + Math.tan(radiano));
        System.out.println("Cossec: " + cossec + " Sec: " + sec + " Cotg: " + cotg);
        sc.close();
    }
}
