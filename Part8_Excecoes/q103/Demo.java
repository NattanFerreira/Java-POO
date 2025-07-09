package Part8_Excecoes.q103;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String meses[] = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho","Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        try {
            numero = sc.nextInt();
            System.out.println(meses[numero-1]);
        } catch (InputMismatchException e) {
            System.out.println("Erro de tipo de valor, esperava-se um inteiro");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Digite um valor dentro de 1-12");
        }
        sc.close();

    }
}
