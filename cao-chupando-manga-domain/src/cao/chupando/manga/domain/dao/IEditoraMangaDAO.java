package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.EditoraManga;
import java.util.List;

/**
 *
 * @author henrique
 */
public interface IEditoraMangaDAO {
 public void inserir(EditoraManga ent);
    
    public void atualizar(EditoraManga ent);
    
    public void remover(int id);
    
    public List<EditoraManga> consultar();    
}
