package lista.q38;
/*Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado) e os 
métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua
um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para
isso, utilize uma instância da classe Contador criada anteriormente e implemente a 
lógica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre
as capacidades da classe criada. */
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
