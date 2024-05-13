package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }
            carrinho.removeAll(itensParaRemover);
        } else {
            System.out.println("Não há itens para remover.");
        }
    }

    public void calcularValorTotal() {
        if (!carrinho.isEmpty()) {
            double total = 0;
            for (Item item : carrinho) total += item.getPreco() * item.getQuantidade();
            System.out.println("Total: " + total);
        } else {
            System.out.println("Não há itens no carrinho.");
        }
    }

    public void exibirItens() {
        if (!carrinho.isEmpty()) {
            System.out.println(carrinho);
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }
}
