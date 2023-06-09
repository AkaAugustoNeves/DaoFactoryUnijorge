package br.com.augusto.escolav3.service;

import br.com.augusto.escolav3.exception.AlunoNaoEncontradoException;
import br.com.augusto.escolav3.exception.DAOFactoryException;
import br.com.augusto.escolav3.factory.DAOFactory;
import br.com.augusto.escolav3.model.enuns.TipoDAO;
import java.sql.SQLException;

/**
 *
 * @author Neves
 */
public class AlunoService {
    
    private final DAOFactory daoFactory;

    public AlunoService(DAOFactory daoFactory) {
        this.daoFactory = daoFactory;
    }   
    
    public String buscarPorMatricula(int matricula) throws DAOFactoryException, SQLException, AlunoNaoEncontradoException{
        return daoFactory.criar(TipoDAO.ALUNO).buscarPorMatricula(matricula);
    }
    
}
