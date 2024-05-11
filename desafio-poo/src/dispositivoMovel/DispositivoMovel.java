package dispositivoMovel;

public abstract class DispositivoMovel {
    // Propriedades comuns a todos os dispositivos móveis
    protected String marca;
    protected String modelo;
    protected boolean ligado;

    // Método construtor
    public DispositivoMovel(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false; // Por padrão, o dispositivo começa desligado
    }

    // Método para ligar o dispositivo
    public void ligar() {
        if (!ligado) {
            System.out.println("Ligando o dispositivo " + marca + " " + modelo + "...");
            ligado = true;
            System.out.println("Dispositivo ligado.");
        } else {
            System.out.println("O dispositivo já está ligado.");
        }
    }

    // Método para desligar o dispositivo
    public void desligar() {
        if (ligado) {
            System.out.println("Desligando o dispositivo " + marca + " " + modelo + "...");
            ligado = false;
            System.out.println("Dispositivo desligado.");
        } else {
            System.out.println("O dispositivo já está desligado.");
        }
    }

    // Métodos abstratos que representam comportamentos específicos do dispositivo
    public abstract void usarAplicativo();
    public abstract void realizarChamada(String numero);
    public abstract void receberChamada(String numero);
}
