package Part1_Introducao;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int valorFigura, valorNaipe;
        String [] nomes =  {"As","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Valete","Dama","Rei"};
        String [] naipes =  {"Ouros","Paus","Copas","Espadas"};

        System.out.println("Digite o valor da carta (1-13): ");
        valorFigura = sc.nextInt();

        if(valorFigura > 0 && valorFigura <=13){
            System.out.println("Digite o valor da carta (1 = ouros, 2 = paus, 3 = copas, 4 = espadas");
            valorNaipe = sc.nextInt();

            if(valorNaipe > 1 && valorNaipe <= 4){
                System.out.println(nomes[valorFigura-1] + " de " + naipes[valorNaipe-1]);
            }else System.out.println("Naipe invalido");

        }else System.out.println("Valor invalido");
        sc.close();
    }
}
