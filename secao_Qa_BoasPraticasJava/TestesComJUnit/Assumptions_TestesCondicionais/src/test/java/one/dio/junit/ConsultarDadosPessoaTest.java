package one.dio.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosPessoaTest {

    @BeforeAll // ESSE CODIGO É EXECUTADO ANTES DE TUDO
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
    }

    @AfterAll // ESSE CODIGO É EXECUTADO DEPOIS DE TUDO
    static void encerrarConexao() {
        BancoDeDados.encerrarConexao();
    }

    @BeforeEach // ESSE CODIGO É EXECUTADO ANTES DE CADA TESTE
    void inserePessoa() {
        Pessoa pessoa = new Pessoa("Joao", LocalDate.now());
        BancoDeDados.insereDados(pessoa);
    }

    @AfterEach // ESSE CODIGO É EXECUTADO DEPOIS DE CADA TESTE
    void removePessoa() {
        Pessoa pessoa = new Pessoa("Joao", LocalDate.now());
        BancoDeDados.removeDados(pessoa);
    }

    /* TESTES */
    @Test
    void validarDadosRetorno() {
        Assertions.assertTrue(true);
        System.out.println("=== TESTE  OK");
    }

    @Test
    void validarDadosRetorno2() {
        Assertions.assertTrue(true);
        System.out.println("=== TESTE  OK");
    }
    /* TESTES */
}
