package one.dio.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoOrdemTeste {

    @Order(3)
    @Test
    void valida3() {
        System.out.println("=== TESTE 3");
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void valida2() {
        System.out.println("=== TESTE 2");
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void valida1() {
        System.out.println("=== TESTE 1");
        Assertions.assertTrue(true);
    }
}
