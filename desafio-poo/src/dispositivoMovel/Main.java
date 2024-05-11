package dispositivoMovel;

import dispositivoMovel.interfaces.AparelhoTelefonico;
import dispositivoMovel.interfaces.NavegadorInternet;
import dispositivoMovel.interfaces.ReprodutorMusical;
import dispositivoMovel.iphone.Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Iphone iphone = new Iphone();

        while (true) {
            System.out.println("Qual o app escolhido? ");
            System.out.println("1. Ipod");
            System.out.println("2. Phone");
            System.out.println("3. Internet");
            System.out.println("0. Digite 0 para sair.");

            int app = scanner.nextInt();

            switch (app) {
                case 1:
                    ReprodutorMusical ipod = iphone;
                    ipod.selecionarMusica();
                    ipod.tocar();
                    ipod.pausar();
                    break;
                case 2:
                    AparelhoTelefonico phone = iphone;
                    phone.ligar();
                    phone.atender();
                    phone.inciarCorreioVoz();
                    break;
                case 3:
                    NavegadorInternet internet = iphone;
                    internet.exibirPagina();
                    internet.atualizarPagina();
                    internet.adicionarNovaAba();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }
}
