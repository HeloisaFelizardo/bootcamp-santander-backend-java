package one.digitalinnovationone.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemTest {

    @DisplayName("Teste que valida se o usuario foi criado")
    @Order(4)
    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }
    @DisplayName("B")
    @Order(3)
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }
    @DisplayName("C")
    @Order(2)
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }
    @DisplayName("D")
    @Order(1)
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}
