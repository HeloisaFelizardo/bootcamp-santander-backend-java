package one.digitalinnovationone.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("Maria", LocalDate.of(2019, 5, 1)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removerDados(new Pessoa("Maria", LocalDate.of(2019, 5, 1)));
    }

    @Test
    void validarDadosDeRetorno(){
        assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
