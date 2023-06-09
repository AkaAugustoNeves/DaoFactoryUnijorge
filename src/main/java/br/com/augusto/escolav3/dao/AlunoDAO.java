package br.com.augusto.escolav3.dao;

import br.com.augusto.escolav3.exception.AlunoNaoEncontradoException;
import br.com.augusto.escolav3.factory.DBConexaoFactoryImpl;
import br.com.augusto.escolav3.factory.DBConexaoFactory;
import br.com.augusto.escolav3.model.interfaces.BaseDAO;
import br.com.augusto.escolav3.model.entities.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Neves
 */
public class AlunoDAO implements BaseDAO{

    DBConexaoFactory dbConexaoFactory = new DBConexaoFactoryImpl();
    Connection conexao;

    public AlunoDAO(Connection criarConexao) throws SQLException {
        this.conexao = dbConexaoFactory.criarConexao();
    }
    
    @Override
    public String buscarPorMatricula(int matricula) throws SQLException, AlunoNaoEncontradoException {
        String query = "SELECT id, matricula, nome FROM aluno WHERE matricula = ?";
        PreparedStatement statement = this.conexao.prepareStatement(query);
        statement.setInt(1, matricula);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            return apresentarAluno(new Aluno(id, matricula, nome));
        } else {
            throw new AlunoNaoEncontradoException("Aluno não encontrado no banco de dados.");
        }
    }   
    
    private String apresentarAluno(Aluno aluno){
        return aluno.toString();
    }
    
}
