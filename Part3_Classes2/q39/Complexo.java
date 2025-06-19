package q39;
public class Complexo {
    private double parteReal;
    private double parteImaginaria;
    
    public Complexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    public Complexo(double parteReal) {
        this.parteReal = parteReal;
        this.parteImaginaria = 0;
    }
    public Complexo() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }
    @Override
    public String toString() {
        if (parteImaginaria >= 0) {
            return parteReal + " + " + parteImaginaria + "i";
        } else {
            return parteReal + " - " + Math.abs(parteImaginaria) + "i";
        }
    }
    public double getParteReal() {
        return parteReal;
    }
    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }
    public double getParteImaginaria() {
        return parteImaginaria;
    }
    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
    
}
