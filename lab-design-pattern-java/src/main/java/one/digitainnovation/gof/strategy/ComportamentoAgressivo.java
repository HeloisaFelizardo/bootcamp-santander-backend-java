package one.digitainnovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Mover comportamento agressivo");
    }
}
