package BancoDigital;

import java.time.LocalDate;

public class Transacao {
    final private LocalDate data;
    final private double valor;
    final private String tipo;
    final private Conta contaOrigem;
    final private Conta contaDestino;

    public Transacao(LocalDate data, double valor, String tipo, Conta contaOrigem, Conta contaDestino) {
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void realizar() {
        switch (tipo.toLowerCase()) {
            case "transferencia":
                contaOrigem.transferir(valor, contaDestino);
                break;
            case "deposito":
                contaDestino.depositar(valor);
                break;
            case "saque":
                contaOrigem.sacar(valor);
                break;
        }
    }
}
