package Part2_Classes1.q32;

public class Aluno {
    private String nome;
    private int matricula;
    private final float p1, p2, t;

    public Aluno(String nome, int matricula, float p1, float p2, float t) {
        this.nome = nome;
        this.matricula = matricula;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    public float media(){
        return (2.5f*p1 + 2.5f*p2 + 2*t)/7;
    }

    public float provaFinal(float ef){
        if(media() < 3 || media() >= 7){
            return 0;
        }else {
            return (media()*6 + ef*4)/10;
        }
    }
}
