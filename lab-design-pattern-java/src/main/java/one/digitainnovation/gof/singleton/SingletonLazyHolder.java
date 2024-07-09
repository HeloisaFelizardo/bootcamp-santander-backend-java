package one.digitainnovation.gof.singleton;

public class SingletonLazyHolder {
    private static class IntanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
             return IntanceHolder.instancia;
    }
}
