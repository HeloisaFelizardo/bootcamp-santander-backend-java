package dispositivoMovel;

import dispositivoMovel.apps.Internet;
import dispositivoMovel.apps.Ipod;
import dispositivoMovel.apps.Phone;
import dispositivoMovel.interfaces.AparelhoTelefonico;
import dispositivoMovel.interfaces.NavegadorInternet;
import dispositivoMovel.interfaces.ReprodutorMusical;

import java.util.Scanner;

public abstract class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Qual o app escolhido? ");
            System.out.println("1. Ipod");
            System.out.println("2. Phone");
            System.out.println("3. Internet");
            System.out.println("0. Digite 0 para sair.");

            int app = scanner.nextInt();

            switch (app) {
                case 1:
                    Ipod ipod = new Ipod();
                    ipod.selecionarMusica();
                    ipod.tocar();
                    ipod.pausar();
                    break;
                case 2:
                    Phone phone = new Phone();
                    phone.ligar();
                    phone.atender();
                    phone.inciarCorreioVoz();
                    break;
                case 3:
                    Internet internet = new Internet();
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
