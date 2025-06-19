package q75;

public class Livro {
    private String titulo, autor;
    private int numPaginas, anoEdicao;
    
    public Livro(String titulo, String autor, int numPaginas, int anoEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.anoEdicao = anoEdicao;
    }

    public String qualTitulo() {
        return titulo;
    }

    public String qualAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "titulo = " + titulo + ", autor = " + autor + ", numPaginas = " + numPaginas + ", anoEdicao = " + anoEdicao;
    }
}
