package q38;
public class Lampada {
    private boolean estadoDaLampada;
    private Contador ContarAcesas;

    public Lampada(){
        estadoDaLampada = false;
        ContarAcesas = new Contador();
    }
    
    public void acende(){
        if(estadoDaLampada){
            System.out.println("A lampada ja esta acesa");
        }else {
            estadoDaLampada = true; 
            System.out.println("Lampada On");
            ContarAcesas.incrementar();
        }
    }

    public void apaga(){
        if(estadoDaLampada){
            estadoDaLampada = false;
            System.out.println("Lampada off");
        }else{
            System.out.println("A lampada ja esta apagada");
        }
    }

    public void mostraEstado(){
        if (estadoDaLampada){
            System.out.println("A lampada esta acesa");
        }else 
            System.out.println("A lampada esta apagada");
    }

    public boolean estaLigada(){
        return estadoDaLampada;
    }

    public int VezesAcesas(){
        return ContarAcesas.getValor();
    }
}
