package q61;

public class Equipamento {
    private int voltagem;
    private boolean movel;

    
    public Equipamento(int voltagem, boolean movel) {
        this.voltagem = voltagem;
        this.movel = movel;
    }

    public int getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    public boolean isMovel() {
        return movel;
    }
    public void setMovel(boolean movel) {
        this.movel = movel;
    }

    @Override
    public String toString() {
        return "voltagem = " + voltagem + " movel = " + movel;
    }

    
}
