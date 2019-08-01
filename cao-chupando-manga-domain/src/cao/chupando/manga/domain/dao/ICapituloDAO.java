package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Capitulo;
import java.util.List;

/**
 *
 * @author henrique
 */
public interface ICapituloDAO {
 public void salvar(Capitulo ent);
    
    public void atualizar(Capitulo ent);
    
    public void remover(int id);
    
    public List<Capitulo> consultar();    
}
