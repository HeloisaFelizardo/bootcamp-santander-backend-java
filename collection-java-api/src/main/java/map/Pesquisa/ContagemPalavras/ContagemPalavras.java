package main.java.map.Pesquisa.ContagemPalavras;

import main.java.map.Pesquisa.EstoqueProdutos.Produto;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavras(String linguagem, Integer contagem) {
        palavras.put(linguagem, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        } else {
            System.out.println("O Map está vazio.");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null; // Inicializa a variável para armazenar a palavra mais frequente
        int maiorContagem = 0; // Inicializa a maior contagem como 0
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) { // Itera sobre cada entrada no mapa de palavras
            if (entry.getValue() > maiorContagem) { // Verifica se a contagem da palavra atual é maior que a maior contagem encontrada até agora
                maiorContagem = entry.getValue(); // Atualiza a maior contagem encontrada
                linguagemMaisFrequente = entry.getKey(); // Atualiza a palavra mais frequente
            }
        }
        return linguagemMaisFrequente; // Retorna a palavra mais frequente
    }
}
