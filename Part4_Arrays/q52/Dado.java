package q52;

import java.util.Random;

public class Dado {
    private static final Random random = new Random();
    private int dado;

    public int lancarDados(){
        this.dado = random.nextInt(6);
        this.dado += 1;
        return this.dado;
    }    
}
