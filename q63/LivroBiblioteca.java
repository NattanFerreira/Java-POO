package q63;

public class LivroBiblioteca extends Livro {
    private int id;

    public LivroBiblioteca(String nome, String autor, String editora, int id) {
        super(nome, autor, editora);
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + " id = " + id;
    }
    
}
