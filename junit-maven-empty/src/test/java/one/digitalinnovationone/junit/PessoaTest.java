package one.digitalinnovationone.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa julia = new Pessoa("Julia", LocalDate.of(2000,1,1));
        Assertions.assertEquals(24, julia.getIdade());
    }

    @Test //Anotação é primordial para testar
    void validarSeEhMaiorDeIdade(){
        Pessoa julia = new Pessoa("Julia", LocalDate.of(2000,1,1)); //Cria um cenário
        Assertions.assertTrue(julia.ehMaiorDeIdade()); //Executa as validações

        Pessoa joao = new Pessoa("Joao", LocalDate.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
