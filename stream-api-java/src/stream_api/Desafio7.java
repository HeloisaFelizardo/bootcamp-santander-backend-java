package stream_api;

import java.util.*;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o maior número da lista
        Integer maiorNumero = numeros.stream().max(Integer::compareTo).orElse(null);

        // Encontrar o segundo maior número da lista
        Integer segundoMaiorNumero = numeros.stream()
                .filter(n -> !n.equals(maiorNumero))
                .max(Integer::compareTo)
                .orElse(null);

        System.out.println(segundoMaiorNumero);
    }
}

/*
* Explicação:
*
* Encontrar o Maior Número:
*
* numeros.stream().max(Integer::compareTo).orElse(null)
*
* encontra o maior número da lista. orElse(null) é usado para retornar
* null se a lista estiver vazia.
*
* Encontrar o Segundo Maior Número:
*
* numeros.stream()
* .filter(n -> !n.equals(maiorNumero))
* .max(Integer::compareTo)
* .orElse(null)
*
* filtra a lista para excluir o maior número e, em seguida,
* encontra o maior número restante, que é o segundo maior número.
*/
