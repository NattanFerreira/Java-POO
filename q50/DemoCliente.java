package q50;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        int id = 0; 
        int idade;
        String telefone, nome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite id, idade, telefone e nome ate que seja digitado um id negativo");
        while(true){
            System.out.println("Digite um id:");
            id = Integer.parseInt(sc.nextLine());
            if(id < 0) break;
            System.out.println("Digite a idade:"); 
            idade = Integer.parseInt(sc.nextLine());
            System.out.println("Digite o telefone:");
            telefone = sc.nextLine();
            System.out.println("Digite o nome:");
            nome = sc.nextLine();
            clientes.add(new Cliente(id, nome, idade, telefone));                                
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        sc.close();
    }
}
