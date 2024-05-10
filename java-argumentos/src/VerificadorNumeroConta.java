import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String conta = scanner.nextLine();
            verificarNumeroConta(conta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + "Número da conta é inválido.");
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta
    // tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException();
        }
    }
}
