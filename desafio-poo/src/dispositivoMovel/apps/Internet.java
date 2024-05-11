package dispositivoMovel.apps;

import dispositivoMovel.interfaces.NavegadorInternet;

public class Internet implements NavegadorInternet {

    public void exibirPagina() {
        System.out.println("Exibindo página da internet.");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página da internet.");
    }
}
