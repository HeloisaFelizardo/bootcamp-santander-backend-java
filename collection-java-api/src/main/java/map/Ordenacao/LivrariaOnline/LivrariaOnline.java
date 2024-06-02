package main.java.map.Ordenacao.LivrariaOnline;

import java.util.*;

public class LivrariaOnline {
    // Mapa que armazena os livros com o link como chave e o objeto Livro como valor.
    Map<String, Livro> livros;

    // Construtor que inicializa o mapa de livros.
    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    // Método para adicionar um livro ao mapa.
    public void adicionarLivro(String link, Livro livro) {
        livros.put(link, livro);
    }

    // Método para remover um livro do mapa com base no título.
    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        // Itera sobre as entradas do mapa e adiciona as chaves dos livros que têm o título especificado à lista.
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        // Remove os livros do mapa usando as chaves coletadas.
        for (String chave : chavesRemover) {
            livros.remove(chave);
        }
    }

    // Método para exibir os livros ordenados por preço.
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        // Cria uma lista das entradas do mapa para ordenação.
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());

        // Ordena a lista de entradas usando o ComparatorPorPreco.
        livrosParaOrdenarPorPreco.sort(new ComparatorPorPreco());

        // Cria um LinkedHashMap para preservar a ordem de inserção.
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        // Insere as entradas ordenadas no LinkedHashMap.
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    // Método para exibir os livros ordenados por autor.
    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        // Cria uma lista das entradas do mapa para ordenação.
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());

        // Ordena a lista de entradas usando o ComparatorPorAutor.
        livrosParaOrdenarPorAutor.sort(new ComparatorPorAutor());

        // Cria um LinkedHashMap para preservar a ordem de inserção.
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        // Insere as entradas ordenadas no LinkedHashMap.
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    // Método para pesquisar livros por autor.
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        // Itera sobre as entradas do mapa e adiciona os livros que têm o autor especificado ao LinkedHashMap.
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    // Método para obter o livro mais caro.
    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        // Verifica se o mapa está vazio.
        if (!livros.isEmpty()) {
            // Encontra o maior preço entre os livros.
            for (Livro livro : livros.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        // Adiciona os livros que têm o maior preço à lista.
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    // Método para obter o livro mais barato.
    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        // Verifica se o mapa está vazio.
        if (!livros.isEmpty()) {
            // Encontra o menor preço entre os livros.
            for (Livro livro : livros.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        // Adiciona os livros que têm o menor preço à lista.
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }
}
