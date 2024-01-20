package one.dio.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        // fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void encerrarConexao() {
        // fez algo
        LOGGER.info("Encerrou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        // insere no DB
        LOGGER.info("Pessoa inserida no DB");
    }

    public static void removeDados(Pessoa pessoa) {
        // remove do DB
        LOGGER.info("Pessoa removida no DB");
    }
}
