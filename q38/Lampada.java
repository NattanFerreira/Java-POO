package q38;
public class Lampada {
    private boolean estadoDaLampada;
    
    public void acende(){
        if(estadoDaLampada){
            System.out.println("A lampada ja esta acesa");
        }else {
            estadoDaLampada = true; 
            System.out.println("Lampada On");
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
}
