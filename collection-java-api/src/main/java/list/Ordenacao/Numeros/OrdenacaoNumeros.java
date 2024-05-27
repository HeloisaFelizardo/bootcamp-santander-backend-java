package main.java.list.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
       numerosList.add(numero);
    }

    public List<Integer> ordenarCrescente() {
        List<Integer> crescente = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()) {
            Collections.sort(crescente);
            return crescente;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Integer> ordenarDescrescente() {
        List<Integer> crescente = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()) {
            crescente.sort(Collections.reverseOrder());
            return crescente;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void  exibirNumeros(){
        if(!numerosList.isEmpty()) {
            System.out.println(numerosList);
        }else {
            System.out.println("A lista esta vazia");
        }
    }
}
