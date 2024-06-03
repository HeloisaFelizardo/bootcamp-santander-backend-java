package stream_api;

import java.util.*;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Verificar se a lista contém algum número maior que 10:
        boolean maiorQue10 = numeros.stream().anyMatch(numero -> numero > 10);

        System.out.println(maiorQue10);
    }
}
