package br.com.augusto.escolav3.factory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Neves
 */
public interface DBConexaoFactory {
    
    Connection criarConexao() throws SQLException;    
    void fecharConexao(Connection conexao) throws SQLException;
    
}
