package one.digitainnovation.gof.strategy;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Mover comportamento normal");
    }
}
