package BancoDigital;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação do banco digital
        BancoDigital banco = new BancoDigital();

        // Criação do cliente
        Cliente heloisa = new Cliente();
        heloisa.setNome("Heloisa");

        // Abertura de contas
        ContaCorrente cc = (ContaCorrente) banco.abrirConta(heloisa, "corrente", 1000);
        Conta poupanca = banco.abrirConta(heloisa, "poupanca", 0.01); // 1% de juros

        // Cadastrando dados do cliente
        heloisa.setCpf("55555555555");
        heloisa.setEndereco("Rua das Acácias, 09");

        // Atualizando dados do cliente
        heloisa.atualizarInformacoes("Rua dos Lirios, 25");

        // Imprimir dados do cliente
        cc.imprimirDadosDoCliente();

        // Realizando depósitos
        cc.depositar(100);
        System.out.println("Após depósito de 100 na Conta Corrente:");
        cc.imprimirExtrato();

        // Realizando transferências
        cc.transferir(50, poupanca);
        System.out.println("Após transferência de 50 da Conta Corrente para Conta Poupança:");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Calculando rendimento
        double rendimento = ((ContaPoupanca) poupanca).calcularRendimento();
        System.out.println("Rendimento da Conta Poupança: " + rendimento);

        // Realizando saques que utilizam o cheque especial
        cc.sacar(500); // Isso deve fazer com que a conta fique com saldo negativo
        System.out.println("Após saque de 500 da Conta Corrente:");
        cc.imprimirExtrato();

        // Calculando juros do cheque especial
        double jurosChequeEspecial = cc.calcularJurosChequeEspecial();
        System.out.println("Juros do Cheque Especial: " + jurosChequeEspecial);

        // Realizando uma transação direta
        Transacao transacao = new Transacao(LocalDate.now(), 20, "deposito", null, cc);
        banco.realizarTransacao(transacao);
        System.out.println("Após transação de depósito de 20 na Conta Corrente via Transacao:");
        cc.imprimirExtrato();

        // Fechando uma conta
        banco.fecharConta(poupanca);
        System.out.println("Conta Poupança fechada.");
    }
}
