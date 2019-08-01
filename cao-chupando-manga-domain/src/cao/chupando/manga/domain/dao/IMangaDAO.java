
package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Manga;
import java.util.List;

/**
 *
 * @author henrique
 */
public interface IMangaDAO {
 public void salvar(Manga ent);
    
    public void atualizar(Manga ent);
    
    public void remover(int id);
    
    public List<Manga> consultar();    
}
