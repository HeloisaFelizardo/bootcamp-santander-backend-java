package dispositivoMovel.apps;

import dispositivoMovel.interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Ipod tocando.");
    }

    public void pausar() {
        System.out.println("Ipod pausando.");
    }

    public void selecionarMusica() {
        System.out.println("Ipod selecionando musica.");
    }
}