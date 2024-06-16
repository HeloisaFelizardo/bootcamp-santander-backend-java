package one.digitalinnovationone.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("12345", 0);
        Conta contaDestino = new Conta("54321", 0);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        //Verificando se será lançado uma exceção
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transferir(contaOrigem, contaDestino, -1)
        );

        //Verificando se não será lançado uma exceção
        Assertions.assertDoesNotThrow( () ->
                transferenciaEntreContas.transferir(contaOrigem, contaDestino, 20)
        );
    }
}
