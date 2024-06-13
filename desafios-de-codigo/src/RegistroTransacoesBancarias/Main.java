package RegistroTransacoesBancarias;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldoBancario = 0;
        int quantidadeTransacoes = 0;

        try {
            // Lê a Entrada que informa o saldo inicial da conta
            saldoBancario = scanner.nextDouble();

            // Lê a Entrada com a quantidade total de transações
            quantidadeTransacoes = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira números válidos.");
            scanner.next(); // Limpa o buffer do scanner
            return; // Encerra o programa
        }

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê a Entrada com o tipo de transação (D para depósito ou S para saque)
            // O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            // Lê a Entrada com o valor da transação
            double valorTransacao = scanner.nextDouble();

            // Atualiza o saldo da conta e adicionar a transação à lista
            if (tipoTransacao == 'D') {
                saldoBancario += valorTransacao;
                double saque = valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldoBancario -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // TODO: Exibir o saldo final e a lista de transações conforme a tabela de Exemplos.
        System.out.println("Saldo: " + saldoBancario);

        System.out.println("Transacoes:");

        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}