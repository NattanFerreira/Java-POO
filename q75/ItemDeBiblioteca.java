package q75;

public interface ItemDeBiblioteca {
    int MAXIMO_DE_DIAS_PARA_EMPRESTIMO = 14;

    public boolean estaEmprestado();

    public void empresta();

    public void devolve();

    public String localizacao();

    public String descricao();

}
