package one.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarComCondicao() {
        Assumptions.assumeTrue(true); // o codigo abaixo é executado somente se a condição for true
        Assertions.assertEquals(10, 5 + 5);
    }
}
