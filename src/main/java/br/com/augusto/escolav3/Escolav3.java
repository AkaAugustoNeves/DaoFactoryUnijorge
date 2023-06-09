package br.com.augusto.escolav3;

import br.com.augusto.escolav3.exception.AlunoNaoEncontradoException;
import br.com.augusto.escolav3.exception.DAOFactoryException;
import br.com.augusto.escolav3.factory.DAOFactory;
import br.com.augusto.escolav3.factory.DAOFactoryImpl;
import br.com.augusto.escolav3.service.AlunoService;
import java.sql.SQLException;

/**
 *
 * @author Neves
 */
public class Escolav3 {

    public static void main(String[] args) throws DAOFactoryException, SQLException, AlunoNaoEncontradoException {
        DAOFactory daoFactory = new DAOFactoryImpl();
        AlunoService alunoService = new AlunoService(daoFactory);
        System.out.println(alunoService.buscarPorMatricula(1));        
    }
}
