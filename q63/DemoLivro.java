package q63;

public class DemoLivro {
    public static void main(String[] args) {
        LivroBiblioteca l1 = new LivroBiblioteca("Biblia", "João", "Vida", 1);
        LivroLivraria l2 = new LivroLivraria("1964", "George", "Status", 150);

        System.out.println(l1);
        System.out.println(l2);
    }
}
