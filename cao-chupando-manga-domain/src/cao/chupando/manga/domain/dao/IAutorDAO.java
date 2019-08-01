
package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Autor;
import java.util.List;

/**
 *
 * @author henrique
 */
public interface IAutorDAO {
     public void salvar(Autor ent);
    
    public void atualizar(Autor ent);
    
    public void remover(int id);
    
    public List<Autor> consultar();
    
}
