package stream_api;

import java.util.*;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Imprima a soma dos números pares da lista:
        Integer somaPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);

        // Imprime o resultado
        System.out.println(somaPares);
    }
}
