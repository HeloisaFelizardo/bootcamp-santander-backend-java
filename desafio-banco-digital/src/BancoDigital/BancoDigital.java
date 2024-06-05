package BancoDigital;

import java.util.ArrayList;
import java.util.List;

public class BancoDigital {
    private List<Conta> contas;
    private List<Transacao> transacoes;

    public BancoDigital() {
        this.contas = new ArrayList<>();
        this.transacoes = new ArrayList<>();
    }

    public Conta abrirConta(Cliente cliente, String tipoConta, double parametro) {
        Conta conta = null;

        if ("corrente".equalsIgnoreCase(tipoConta)) {
            conta = new ContaCorrente(cliente, parametro);
        } else if ("poupanca".equalsIgnoreCase(tipoConta)) {
            conta = new ContaPoupanca(cliente, parametro);
        }

        if (conta != null) {
            contas.add(conta);
        }

        return conta;
    }

    public void fecharConta(Conta conta) {
        contas.remove(conta);
    }

    public void realizarTransacao(Transacao transacao) {
        transacao.realizar();
        transacoes.add(transacao);
    }
}
