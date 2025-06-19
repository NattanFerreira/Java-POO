package Part1_Introducao;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, unidade, dezena, centena, ucd;
        do {
        System.out.println("Digite um numero de 3 digitos: ");
        numero = sc.nextInt();
        } while(numero < 100 || numero > 1000);
        unidade = numero % 10;
        dezena = (numero % 100)/10;
        centena =  numero/100;
        ucd = (unidade*100) + (centena*10) + dezena;
        System.out.println("O numero CDU: " + numero + " Em formato UCD eh: " + ucd );
        sc.close();
    }
}
