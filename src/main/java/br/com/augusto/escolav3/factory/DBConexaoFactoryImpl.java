package br.com.augusto.escolav3.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Neves
 */
public class DBConexaoFactoryImpl implements DBConexaoFactory{
    
    final String url = "jdbc:postgresql://localhost:5432/bd_escola";
    final String usuario = "escola";
    final String senha = "escola";

    @Override
    public Connection criarConexao() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }   

    @Override
    public void fecharConexao(Connection conexao) throws SQLException {
        if(conexao != null && !conexao.isClosed()){
            conexao.close();
        }
    }
    
}