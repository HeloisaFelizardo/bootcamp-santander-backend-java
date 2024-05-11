package dispositivoMovel.apps;

import dispositivoMovel.interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Pausando música.");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }
}