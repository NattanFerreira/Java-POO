package q38;
import java.util.Scanner;

public class DemoLampada {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("Voce deseja ligar ou desligar a lampada?(1 para ligar, 2 para desligar e 0 para sair)");
            l1.mostraEstado();
            op = sc.nextInt();
            if (op == 1) {
                l1.acende();
            }else if (op == 2) {
                l1.apaga();
            }
        }while (op !=0);
        System.out.println("A lampada foi acesa " + l1.VezesAcesas() + " vezes");
        sc.close();
    }
}
    

