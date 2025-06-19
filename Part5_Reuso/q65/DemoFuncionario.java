package q65;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Nattan", 1000);
        Assistente f2 = new Assistente("Marcos", 1500, 2025);
        Tecnico f3 = new Tecnico("Joao", 2000, 2020, 100);
        Administrativo f4 = new Administrativo("Santos", 1800, 2021, false, 200);
        Administrativo f5 = new Administrativo("Jose", 1800, 2021, true, 200);

        System.out.println(f1.toString() + " " + f1.ganhoAnual());
        System.out.println(f2.toString() + " " + f2.ganhoAnual());
        System.out.println(f3.toString() + " " + f3.ganhoAnual());
        System.out.println(f4.toString() + " " + f4.ganhoAnual());
        System.out.println(f5.toString() + " " + f5.ganhoAnual());

    }
}
