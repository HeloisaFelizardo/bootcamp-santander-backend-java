package dispositivoMovel.iphone;

import dispositivoMovel.interfaces.AparelhoTelefonico;
import dispositivoMovel.interfaces.NavegadorInternet;
import dispositivoMovel.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    public void ligar() {
        System.out.println("Ligando do app Phone do Iphone.");
    }

    public void atender() {
        System.out.println("Atendendo ligação do app Phone do Iphone.");
    }

    public void inciarCorreioVoz() {
        System.out.println("Iniciando correio de voz do Iphone.");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página do app Internet do Iphone.");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba do app Internet do Iphone.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página do app Internet do Iphone.");
    }

    public void tocar() {
        System.out.println("Tocando música do app Ipod do Iphone.");
    }

    public void pausar() {
        System.out.println("Pausando a música do app Ipod do Iphone.");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música do app Ipod do Iphone.");
    }
}
