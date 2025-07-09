package Part8_Excecoes.q102;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = obterIntValido(sc);
        int n2 = obterIntValido(sc);
        System.out.println("A soma entre eles eh:" + (n + n2));
    }

public static int obterIntValido(Scanner sc) {
        int numero = 0;
        boolean verif = false;
        while (!verif) { 
            System.out.print("Digite o numero: ");
            try {
                numero = sc.nextInt();
                verif = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um valor inteiro válido.");
                sc.nextLine(); 
            }
        }
        
        return numero;
    }
}
