package one.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test // TESTE PARA VALIDAR EXCEPTION IllegalArgumentException NA FUNÇÃO transfere() passando valor 0
    void validaExcecaoTransfZero() {
        Conta conta1 = new Conta(1);
        Conta conta2 = new Conta(2);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(conta1, conta2, 0));
    }

    @Test // TESTE PARA VALIDAR NÃO OCORRENCIA DE EXCEPTION
    void validaExecucaoSucesso() {
        Conta conta1 = new Conta(1);
        Conta conta2 = new Conta(2);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(conta1, conta2, 19));
    }
}
