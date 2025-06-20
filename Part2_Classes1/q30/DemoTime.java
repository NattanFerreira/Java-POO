package Part2_Classes1.q30;

public class DemoTime {
    public static void main(String[] args) {
        Time t1 = new Time("Corinthias", "COR", "Brasil", 7);
        Time t2 = new Time("Sao Paulo", "SAO", "Brasil", 5);
        Time t3 = new Time("Barcelona", "FCB", "Espanha", 4);
        Time t4 = new Time("Real Madrid", "RMD", "Espanha", 6);

        t1.setTitulos(10);
        t2.setNome("Liverpool");
        t2.setAbrev("LIV");
        t2.setPais("Inglaterra");
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}