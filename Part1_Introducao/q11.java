package Part1_Introducao;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        float x1, y1, x2,y2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a coordenada x do primeiro ponto: ");
        x1 = sc.nextFloat();
        System.out.println("Digite a coordenada y do primeiro ponto: ");
        y1 = sc.nextFloat();
        System.out.println("Digite a coordenada x do segundo ponto: ");
        x2 = sc.nextFloat();
        System.out.println("Digite a coordenada y do segundo ponto: ");
        y2 = sc.nextFloat();

        if(x2 > x1){
            if(y2 > y1)System.out.println("O ponto 2 esta acima e a direita do ponto 1");
            else if(y2 < y1)System.out.println("O ponto 2 esta abaixo e a direita do ponto 1");
            else System.out.println("O ponto 2 esta a direita do ponto 1");

        }else if (x2 < x1) {
            if(y2 > y1)System.out.println("O ponto 2 esta acima e a esquerda do ponto 1");
            else if(y2 < y1) System.out.println("O ponto 2 esta abaixo e a esquerda do ponto 1");
            else System.out.println("O ponto 2 esta a esquerda do ponto 1");

        }else {
            if(y2 > y1) System.out.println("O ponto 2 esta acima do ponto 1");
            else if(y2 < y1) System.out.println("O ponto 2 esta abaixo do ponto 1");
            else System.out.println("Os pontos estao no mesmo lugar");
        }
        sc.close();
    }
}
