package stream_api;

import java.util.*;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se todos os números da lista são distintos (não se repetem):
        boolean naoRepetem = numeros.stream().distinct().count() == numeros.size();

        System.out.println(naoRepetem);
    }
}
