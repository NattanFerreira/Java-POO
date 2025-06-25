package Part7_Colecoes.q95;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os parentes para a analise:");
        String parenteses = sc.nextLine();
        System.out.println((verifica(parenteses)? "Balanceado" : "Nao balanceado"));
        sc.close();
    }

    public static boolean verifica(String parenteses){
        Stack<Character>pilha = new Stack<>();
        char verif;
        for (int i = 0; i < parenteses.length(); i++) {
            verif = parenteses.charAt(i);
            if(verif == '('){
                pilha.add(verif);
            }else if (pilha.isEmpty()) {
                return false;
            }
            else{
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}
