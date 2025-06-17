package lista.q36;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes = 0;

    public Elevador(int capacidade, int totalAndares) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    public void entra() {
        if (pessoasPresentes < capacidade){
            pessoasPresentes++;
            System.out.println("Operacao entrar realizada");
        }else System.out.println("Ja esta cheio");
    }

    public void sai(){
        if (pessoasPresentes>0){ 
            pessoasPresentes--;
            System.out.println("Operacao sair realizada");
        }
        else System.out.println("nao ha pessoas no elevador");
    }

    public void sobe(int andar){
        if (andar > andarAtual && andar <= totalAndares){
            System.out.println("Operacao subir realizada");
            andarAtual = andar;
        }else{
            System.out.println("Erro");
        }
    }

    public void desce(int andar){
        if(andar < andarAtual && andar >=0){
            System.out.println("Operacao descer realizada");
            andarAtual = andar;
        }else{ 
            System.out.println("Erro");
        }
    }

    @Override
    public String toString() {
        return "Elevador [andarAtual=" + andarAtual + ", totalAndares=" + totalAndares + ", capacidade=" + capacidade
                + ", pessoasPresentes=" + pessoasPresentes + "]";
    }

    
}
