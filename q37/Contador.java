package lista.q37;
// Escreva a classe Contador que encapsule um valor usado para contagem de eventos.
// Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo
// com que o acesso ao valor seja feito através de métodos que devem zerar, incrementar e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as
// capacidades da classe criada.
public class Contador {
    private int contEventos;

    public int getContEventos() {
        return contEventos;
    }

    public void zerar(){
        contEventos = 0;
    }

    public void incrementar(){
        contEventos++;
    }

    public void incrementar(int incremento){
        contEventos = contEventos + incremento;
    }

    @Override
    public String toString() {
        return "Contador [contEventos=" + contEventos + "]";
    }

}
