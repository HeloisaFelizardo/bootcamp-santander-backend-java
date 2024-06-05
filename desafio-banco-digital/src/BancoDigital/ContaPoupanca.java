package BancoDigital;

public class ContaPoupanca extends Conta {
    final private double taxaJuros;

    public ContaPoupanca(Cliente cliente, double taxaJuros) {
        super(cliente);
        this.taxaJuros = taxaJuros;
    }

    public double calcularRendimento() {
        return saldo * taxaJuros;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("====== Extrato Conta Poupanca ======");
        super.imprimirInfosComuns();
    }
}
