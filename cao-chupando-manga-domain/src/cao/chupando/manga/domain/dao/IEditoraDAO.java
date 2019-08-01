package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Editora;
import java.util.List;

/**
 *
 * @author henrique
 */
public interface IEditoraDAO {
 public void salvar(Editora ent);
    
    public void atualizar(Editora ent);
    
    public void remover(int id);
    
    public List<Editora> consultar();    
}
