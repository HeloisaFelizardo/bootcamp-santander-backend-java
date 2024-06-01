package main.java.set.Ordenacao.GerenciadorAlunos;

import java.util.Comparator;
import java.util.Objects;

// Classe Aluno que implementa Comparable<Aluno> para permitir comparação natural por nome
public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matricula;
    private double nota;

    // Construtor para inicializar os atributos da classe Aluno
    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    // Métodos getters para acessar os atributos da classe Aluno
    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    // Método equals para comparar dois objetos Aluno com base na matrícula
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // Verifica se os objetos são idênticos
        if (o == null || getClass() != o.getClass()) return false;  // Verifica se o objeto é do mesmo tipo
        Aluno aluno = (Aluno) o;  // Faz o cast do objeto para Aluno
        return matricula == aluno.matricula;  // Compara as matrículas
    }

    // Método hashCode que retorna o hash baseado na matrícula
    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    // Método toString para representar o objeto Aluno como uma string
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}' + "\n";  // Adiciona nova linha ao final para melhor visualização
    }

    // Método compareTo para comparação natural dos objetos Aluno por nome (ignorando maiúsculas/minúsculas)
    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}

// Comparator para ordenar objetos Aluno por nota
class ComparatorPorNota implements Comparator<Aluno> {

    // Método compare que compara dois objetos Aluno com base na nota
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}

/*
1. Certifique-se de que as classes estão no pacote correto e que a estrutura de diretórios corresponde ao nome do pacote.

2. A implementação de compareTo permite que os objetos Aluno sejam ordenados naturalmente por nome.

3. O ComparatorPorNota permite ordenação por nota, útil em situações onde uma ordenação diferente da natural é necessária.
*/