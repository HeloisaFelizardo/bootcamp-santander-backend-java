package main.java.list.OperacoesBasicas.ListaTarefas;

public class Main {
    public static void main(String[] args) {

        ListaTarefa listaTarefas = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
    }
}
