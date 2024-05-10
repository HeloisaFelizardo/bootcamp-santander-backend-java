import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que informe o limite diário de saque
        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();

        // Loop while para iterar sobre os saques
        while (true) {
            // Solicitar ao usuário o valor do saque
            System.out.print("Informe o valor do saque (ou 0 para encerrar): ");
            double saque = scanner.nextDouble();

            // Verificar se o valor do saque é zero, encerrando as transações
            if (saque == 0) {
                System.out.println("Transações encerradas.");
                break;
            }

            // Verificar se o valor do saque ultrapassa o limite diário
            if (saque <= limiteDiario) {
                limiteDiario -= saque; // Subtrair o valor do saque do limite diário
                // Informar que o saque foi realizado com sucesso e mostrar o limite restante
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break; // Encerrar o loop se o limite diário for atingido
            }
        }

        // Fechar o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
