import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = Integer.valueOf(scanner.nextLine());

        System.out.println("Por favor, digite o número da conta: ");
        String conta = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "
                        + conta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
