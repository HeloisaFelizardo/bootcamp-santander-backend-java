package one.digitainnovation.gof;

import one.digitainnovation.gof.facade.Facade;
import one.digitainnovation.gof.singleton.SingletonEager;
import one.digitainnovation.gof.singleton.SingletonLazy;
import one.digitainnovation.gof.singleton.SingletonLazyHolder;
import one.digitainnovation.gof.strategy.Comportamento;
import one.digitainnovation.gof.strategy.ComportamentoAgressivo;
import one.digitainnovation.gof.strategy.ComportamentoDefensivo;
import one.digitainnovation.gof.strategy.ComportamentoNormal;
import one.digitainnovation.gof.strategy.Robo;

public class Main {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonLazy lazyTest = SingletonLazy.getInstancia();
        System.out.println(lazyTest);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Heloisa", "55522850");
    }
}
