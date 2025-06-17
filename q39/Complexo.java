package lista.q39;
/*Escreva uma classe para representar um número complexo. Essa classe deve conter
três construtores. Um construtor deverá receber os dois valores (parte real e parte imaginária) 
como argumentos, o outro somente o valor real, considerando o imaginário como
sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e
imaginária do número complexo como sendo iguais a zero. Escreva um método toString
que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um
aplicativo de teste que demonstre as capacidades da classe criada. */
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
