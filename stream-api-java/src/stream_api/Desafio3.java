package stream_api;

import java.util.*;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Verifique se todos os números da lista são positivos:
        boolean positivos = numeros.stream().allMatch(numero -> numero > 0);

        System.out.println(positivos);
    }
}
