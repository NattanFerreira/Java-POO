package q65;

public class Administrativo extends Assistente {
    private final boolean turno;
    private final float adicionalNoturno;

    public Administrativo(String nome, float salario, int matricula, boolean turno, float adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        if(!turno){
            this.adicionalNoturno = adicionalNoturno;
            aumentarSalario(adicionalNoturno);
            
        }else this.adicionalNoturno = 0.0F;
    }
    
    @Override
    public float ganhoAnual(){
        return super.ganhoAnual() - adicionalNoturno;
    }

    @Override
    public String toString() {
        return super.toString()+ " turno = " + (turno ? "Dia": "Noite") + ", adicionalNoturno = " + adicionalNoturno;
    }
}
