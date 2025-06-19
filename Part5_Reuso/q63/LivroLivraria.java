package q63;

public class LivroLivraria extends Livro {
    private final float preco;

    public LivroLivraria(String nome, String autor, String editora, float preco) {
        super(nome, autor, editora);
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() + " preco = " + preco;
    }

    
}
