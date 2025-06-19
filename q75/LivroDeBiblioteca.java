package q75;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private final String local, descricao;
    public LivroDeBiblioteca(String titulo, String autor, int numPaginas, int anoEdicao, String local, String descricao) {
        super(titulo, autor, numPaginas, anoEdicao);
        this.local = local;
        this.descricao = descricao;
        this.emprestado = false;
    }

    @Override
    public boolean estaEmprestado(){
        return emprestado;
    }

    @Override
    public void empresta(){
        if(!emprestado) emprestado = true;
        else System.out.println("O livro ja esta emprestado");
    }

    @Override
    public void devolve(){
        if(emprestado) emprestado = false;
        else System.out.println("O livro nao esta emprestado");
    }

    @Override
    public String localizacao(){
        return local;
    }

    @Override
    public String descricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return super.toString() + ", status = " + (emprestado? "Emprestado": "Livre") + ", local = " + local + ", descricao = " + descricao;
    }

    

}
