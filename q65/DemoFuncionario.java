package q65;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Nattan", 1000);
        Assistente f2 = new Assistente("Marcos", 1500, 2025);
        Tecnico f3 = new Tecnico("Joao", 2000, 2020, 100);
        Administrativo f4 = new Administrativo("Santos", 1800, 2021, false, 200);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

    }
}
