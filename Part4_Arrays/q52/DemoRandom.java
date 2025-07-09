package q52;

public class DemoRandom {
    public static void main(String[] args) { 
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        int [] contador = new int[11];
        int soma;
        for (int i = 0; i < 36000000; i++) {
            soma = d1.lancarDados() + d2.lancarDados();
            contador[soma-2]++;
        }
        System.out.println("Somas:");
        for(int i = 0; i<11; i++){
            System.out.println((i+2) + ":" + contador[i]);
        }
        }
    }
