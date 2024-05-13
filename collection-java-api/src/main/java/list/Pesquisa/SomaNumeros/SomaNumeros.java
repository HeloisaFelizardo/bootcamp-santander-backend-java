package main.java.list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numerosList.isEmpty()) {
            for (Integer numero : numerosList) {
                soma += numero;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = 0;
        if (!numerosList.isEmpty()) {
            for (Integer numero : numerosList) {
                if (numero > maior) {
                    maior = numero;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = 0;
        if (!numerosList.isEmpty()) {
            for (Integer numero : numerosList) {
                if (numero < menor) {
                    menor = numero;
                }
            }
            return menor;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
