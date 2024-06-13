package MainContaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial da conta bancária
        double saldoInicial = scanner.nextDouble();

        // Cria uma nova conta bancária com o saldo inicial
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Solicita o valor do depósito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Solicita o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

