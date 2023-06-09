package br.com.augusto.escolav3.factory;

import br.com.augusto.escolav3.dao.AlunoDAO;
import br.com.augusto.escolav3.model.enuns.TipoDAO;
import br.com.augusto.escolav3.model.interfaces.BaseDAO;
import java.sql.SQLException;

/**
 *
 * @author Neves
 */
public class DAOFactoryImpl implements DAOFactory{

    DBConexaoFactory dbConexaoFactory = new DBConexaoFactoryImpl();
    
    @Override
    public BaseDAO criar(TipoDAO tipoDAO) throws SQLException {
        if(tipoDAO.equals(TipoDAO.ALUNO)){
            return new AlunoDAO(dbConexaoFactory.criarConexao());
        }
        return null;
    }  
    
}