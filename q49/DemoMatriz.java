package lista.q49;

import java.util.Scanner;

public class DemoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c,d;
        System.out.println("Digite os numeros da matriz 2x2 em ordem de linha: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        Matriz m = new Matriz(a, b, c, d);
        System.out.println("Determinante:" + m.determinante());
        System.out.println(m.imprime());
        sc.close();        
    }

}
