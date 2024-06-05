package stream_api;

import java.util.*;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Somar os dígitos de todos os números da lista:
        int soma = numeros.stream()
                .map(String::valueOf) // Converte cada número em uma string
                .flatMapToInt(String::chars) // Quebra cada string em seus caracteres
                .map(Character::getNumericValue) // Converte cada caractere em seu valor numérico
                .sum(); // Soma todos os valores numéricos

        System.out.println(soma);
    }
}

/*Explicação:

Conversão para String:

map(String::valueOf) converte cada número na lista em sua representação de string.

Quebra em Caracteres:

flatMapToInt(s -> s.chars()) quebra cada string em seus caracteres individuais e os coloca em uma stream de inteiros.

Conversão para Valor Numérico:

map(Character::getNumericValue) converte cada caractere (representando um dígito) em seu valor numérico.

Soma dos Valores Numéricos:

sum() soma todos os valores numéricos resultantes.

Resultado Esperado:

Para a lista fornecida, a saída será a soma dos dígitos dos números.
Para a lista 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, a soma dos dígitos é:

1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 1 + 0 + 5 + 4 + 3 = 58
*/