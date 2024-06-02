package main.java.map.Pesquisa.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    final private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                    if(p.getPreco() > maiorPreco){
                        produtoMaisCaro = p;
                        maiorPreco = p.getPreco();
                    }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null; // Inicializa a variável para armazenar o produto com o maior valor total no estoque
        double maiorValorTotalProdutoEstoque = 0d; // Inicializa o maior valor total do produto no estoque como 0
        if (!estoqueProdutosMap.isEmpty()) { // Verifica se o mapa de estoque de produtos não está vazio
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) { // Itera sobre cada entrada no mapa de estoque de produtos
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade(); // Calcula o valor total do produto em estoque
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) { // Verifica se o valor total do produto atual é maior que o maior valor total encontrado até agora
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque; // Atualiza o maior valor total encontrado
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue(); // Atualiza o produto com o maior valor total
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque; // Retorna o produto com o maior valor total no estoque
    }

}
