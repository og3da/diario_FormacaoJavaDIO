package one.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(24, jessica.getIdade());
    }

    @Test
    void retornaSeMaior() {
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDate.of(2020, 1, 1));
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
