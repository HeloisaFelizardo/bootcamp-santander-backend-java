package one.digitainnovation.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Mover comportamento defensivo");
    }
}
