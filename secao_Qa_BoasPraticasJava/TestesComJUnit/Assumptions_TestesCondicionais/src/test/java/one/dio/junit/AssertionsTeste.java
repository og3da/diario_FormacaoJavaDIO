package one.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTeste {

    /*
    FAZENDO DIVERSAS VALIDAÇÕES DE CENÁRIO
    UTILIZANDO A LIB "ASSERTIONS" do JUnit
     */

    @Test
    void validarLancamentos() {
        /*
        AQUI ESTAMOS VALIDANDO SE AMBOS ARRAYS TEM VALORES IGUAIS INTERNAMENTE
         */
        int[] primeiroLancamento = {10, 20, 30, 40};
        int[] segundoLancamento = {10, 20, 30, 40};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjNull() {
        /*
        AQUI ESTAMOS VALIDANDO SE O OBJ ESTA NULL
         */
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
    }

    @Test
    void validarSeObjNaoNull() {
        /*
        AQUI ESTAMOS VALIDANDO SE O OBJ NAO ESTA NULL
         */
        Pessoa pessoa = new Pessoa("Luciano", LocalDate.now());
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarSeTiposDif() {
        /*
        AQUI ESTAMOS VALIDANDO SE OS TIPOS DE VALORES SAO DIFERENTES
         */
        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);
    }
}
