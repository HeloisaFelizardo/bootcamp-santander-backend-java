package BancoDigital;

public class ContaCorrente extends Conta {
    private double limiteCheque;

    public ContaCorrente(Cliente cliente, double limiteCheque) {
        super(cliente);
        this.limiteCheque = limiteCheque;
    }

    public double calcularJurosChequeEspecial() {
        if (saldo < 0) {
            double valorUtilizado = Math.abs(saldo);
            return valorUtilizado * 0.02; // 2% ao mês sobre o valor utilizado
        }
        return 0.0;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo + limiteCheque >= valor) {
            saldo -= valor;
        }
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        double juros = calcularJurosChequeEspecial();
        if (juros > 0) {
            double valorUtilizadoChequeEspecial = Math.abs(saldo);
            System.out.println(String.format("Juros Cheque Especial: %.2f", juros));
            System.out.println(String.format("Você utilizou %.2f do cheque especial.", valorUtilizadoChequeEspecial));
            System.out.println(String.format("Agora o saldo devedor do cheque especial é: %.2f", (valorUtilizadoChequeEspecial + juros)));
        }
    }
}
