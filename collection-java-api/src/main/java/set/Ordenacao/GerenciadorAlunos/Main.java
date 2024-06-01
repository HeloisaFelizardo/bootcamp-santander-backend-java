package main.java.set.Ordenacao.GerenciadorAlunos;

public class Main {
    public static void main(String[] args) {

        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Luiz", 1L, 8.65);
        alunos.adicionarAluno("Fernando", 2L, 7.50);
        alunos.adicionarAluno("Gabriela", 3L, 6.54);
        alunos.adicionarAluno("Roberto", 1L, 9.45);
        alunos.adicionarAluno("Amanda", 6L, 9.45);
        alunos.adicionarAluno("Marcia", 4L, 7.98);
        alunos.adicionarAluno("Elisabete", 5L, 9.13);

        alunos.exibirAlunos();

        alunos.removerAluno(4);

        alunos.exibirAlunos();

        System.out.println(alunos.exibirAlunosPorNome());

        System.out.println(alunos.exibirAlunosPorNota());

    }
}
