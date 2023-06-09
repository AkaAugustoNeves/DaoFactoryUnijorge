package br.com.augusto.escolav3.model.interfaces;

import br.com.augusto.escolav3.exception.AlunoNaoEncontradoException;
import java.sql.SQLException;

/**
 *
 * @author Neves
 */
public interface BaseDAO {
    
    public String buscarPorMatricula(int matricula)throws SQLException, AlunoNaoEncontradoException;
    
}
