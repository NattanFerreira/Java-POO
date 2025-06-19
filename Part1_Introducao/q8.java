package Part1_Introducao;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codSetor;
        double preco;
        System.out.println("Digite o codigo do setor (111 para Eletros | 222 para Cama,mesa e banho): ");
        codSetor = sc.nextInt();
        if (codSetor == 111 || codSetor == 222){
            System.out.println("Digite o preco do produto");
            preco = sc.nextDouble();

            if (codSetor == 111){
                if(preco > 100){
                    preco *= 0.6;
                }else if(preco >=50){
                    preco *= 0.8;
                }else preco *= 0.9;
                System.out.println("Setor cama, mesa e banho");
                System.out.println("Preco com desconto: " + preco);

            }else {
                System.out.println("Setor Eletros");
                System.out.println("Preco com desconto: " + (preco > 500 ? preco * 0.9 : preco)); 
            }

        }else System.out.println("Setor invalido");
        sc.close();
    }
}
