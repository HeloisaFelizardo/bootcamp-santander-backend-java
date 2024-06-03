package stream_api;

import java.util.*;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Remova todos os valores ímpares e colete os pares em uma nova lista:
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        // Imprima a lista resultante:
        numerosPares.forEach(System.out::println);
    }
}
