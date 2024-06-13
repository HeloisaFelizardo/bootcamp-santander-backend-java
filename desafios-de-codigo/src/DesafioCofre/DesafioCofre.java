package DesafioCofre;

import java.util.Scanner;

public class DesafioCofre {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {

            int senha = scanner.nextInt();

            int confirmacaoSenha = scanner.nextInt();

            CofreDigital cofreDigital = new CofreDigital(senha);
            cofreDigital.imprimirInformacoes();

            if (cofreDigital.validarSenha(confirmacaoSenha)) {
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }

        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        } else {
            System.out.println("Tipo de cofre inválido.");
        }

        scanner.close();
    }
}