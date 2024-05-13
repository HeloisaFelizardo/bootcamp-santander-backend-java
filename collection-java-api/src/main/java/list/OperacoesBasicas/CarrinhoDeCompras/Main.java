package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.exibirItens();
        carrinho.adicionarItem("Arroz", 23.90, 3);
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
        carrinho.removerItem("Arroz");
        carrinho.exibirItens();
        carrinho.calcularValorTotal();

    }
}