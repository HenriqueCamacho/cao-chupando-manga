package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.AutorManga;
import java.util.List;

/**
 *
 * @author henrique
 */
public interface IAutorMangaDAO {
 public void salvar(AutorManga ent);
    
    public void atualizar(AutorManga ent);
    
    public void remover(int id);
    
    public List<AutorManga> consultar();    
}
