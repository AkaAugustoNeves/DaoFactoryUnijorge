package br.com.augusto.escolav3.factory;

import br.com.augusto.escolav3.exception.DAOFactoryException;
import br.com.augusto.escolav3.model.enuns.TipoDAO;
import br.com.augusto.escolav3.model.interfaces.BaseDAO;
import java.sql.SQLException;

/**
 *
 * @author Neves
 */
public interface DAOFactory {
    
    public BaseDAO criar(TipoDAO tipoDAO) throws SQLException, DAOFactoryException;
    
}