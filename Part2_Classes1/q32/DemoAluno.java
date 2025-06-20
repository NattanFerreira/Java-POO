package Part2_Classes1.q32;

public class DemoAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Nattan", 2023, 5, 7, 3);
        Aluno a2 = new Aluno("Felipe", 2022, 10, 7, 8);
        Aluno a3 = new Aluno("Augusto", 2021, 7, 7, 7);
        Aluno a4 = new Aluno("Clarisse", 2024, 0, 4, 2);

        System.out.println((a1.provaFinal(10)>5? "Aprovado": "Reprovado"));
        System.out.println((a2.media() >= 7? "Aprovado" : "Nao aprovado"));
    }
}
