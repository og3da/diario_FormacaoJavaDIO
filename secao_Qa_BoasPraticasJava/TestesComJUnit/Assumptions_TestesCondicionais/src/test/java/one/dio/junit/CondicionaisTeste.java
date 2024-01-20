package one.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

    @Test
    @EnabledOnOs(OS.WINDOWS) // também tem anotações que podemos incluir uma condição p/o teste executar
    void validarComCondicao() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
