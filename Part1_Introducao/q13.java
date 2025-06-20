package Part1_Introducao;

public class q13 {
    public static void main(String[] args) {
        int cartao [][] = new int[6][10];
        int valor = 1;
        //Preenchendo a matriz igual um bilhete =
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                cartao[i][j] = valor;
                valor++;
            }
        }
        //Imprimindo a matriz em formato de bilhete
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (cartao[i][j] < 10) {
                    System.out.print("0" + cartao[i][j] + " ");
                }else System.out.print(cartao[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
