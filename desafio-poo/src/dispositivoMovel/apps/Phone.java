package dispositivoMovel.apps;

import dispositivoMovel.interfaces.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico {
    public void ligar() {
        System.out.println("Ligando para uma pessoa via app Phone.");
    }

    public void atender() {
        System.out.println("Atendendo o telefone.");
    }

    public void inciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz.");
    }
}
