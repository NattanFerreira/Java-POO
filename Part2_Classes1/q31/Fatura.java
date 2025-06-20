package Part2_Classes1.q31;

public class Fatura {
    private int id,qdtComprada;
    private String descricao;
    private float precoUnitario;

    public Fatura(int id, int qdtComprada, String descricao, float precoUnitario) {
        this.id = id;
        this.descricao = descricao;
        if (qdtComprada < 0) {
            this.qdtComprada = 0;
        } else this.qdtComprada = qdtComprada;
        if(precoUnitario < 0){
            this.precoUnitario = 0.0f;
        }else this.precoUnitario = precoUnitario;
    }

    public float valorTotal(){
        return precoUnitario*qdtComprada;
    }
}
