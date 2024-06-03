package stream_api;

import java.util.*;
import java.util.OptionalDouble;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcule a média dos números maiores que 5:
        OptionalDouble media = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();

        // Verifique se a média está presente e imprima
        if (media.isPresent()) {
            System.out.println(media.getAsDouble());
        } else {
            System.out.println("Nenhum número maior que 5 foi encontrado.");
        }
    }
}
