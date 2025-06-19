package q75;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca l1 = new LivroDeBiblioteca("Biblia", "Deus", 1500, 0, "Prateleira C", "Livro sobre jesus cristo");

        System.out.println(l1.estaEmprestado());
        l1.empresta();
        System.out.println(l1.estaEmprestado());
        l1.devolve();
        System.out.println(l1.estaEmprestado());
        System.out.println(l1.localizacao());
        System.out.println(l1.descricao());
        System.out.println(l1.qualTitulo() + " " + l1.qualAutor());
        System.out.println(l1);

    }
}
