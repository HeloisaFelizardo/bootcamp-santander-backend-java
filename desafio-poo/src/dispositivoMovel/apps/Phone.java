package dispositivoMovel.apps;

import dispositivoMovel.interfaces.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico {
    public void ligar() {
        System.out.println("Ligando para uma pessoa.");
    }

    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    public void inciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz.");
    }
}
