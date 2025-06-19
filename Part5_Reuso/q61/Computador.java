package q61;

public class Computador extends Equipamento {
    private double preco;
    private boolean bag;

    
    public Computador(int voltagem, boolean movel, double preco, boolean bag) {
        super(voltagem, movel);
        this.preco = preco;
        this.bag = bag;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public boolean isBag() {
        return bag;
    }
    public void setBag(boolean bag) {
        this.bag = bag;
    }

    @Override
    public String toString(){
        return super.toString() + " Preco = " + preco + " Bag = " + bag; 
    }

    
}
