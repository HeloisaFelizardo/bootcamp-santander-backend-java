package MainContaBancaria;

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        // Incrementar o saldo com o valor e imprimir "Deposito feito."
        saldo += valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        // Verificar se o saldo é suficiente para realizar o saque
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque feito.");
        } else {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        }
        imprimirSaldo();
    }

    private void imprimirSaldo() {
        // Imprimir o saldo atual formatado
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }
}