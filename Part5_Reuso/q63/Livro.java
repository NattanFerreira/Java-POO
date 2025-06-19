package q63;

public class Livro {
    private final String nome, autor, editora;

    public Livro(String nome, String autor, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", autor = " + autor + ", editora = " + editora;
    }
}
