
package cao.chupando.manga.domain.dao.list;

import cao.chupando.manga.domain.dao.ICategoriaDAO;
import cao.chupando.manga.domain.entidades.Categoria;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author henrique
 */
public class CategoriaDAOImpl implements ICategoriaDAO{
    private static List<Categoria> categorias = new ArrayList<>();
    private static int lastId = 1;
    
    @Override
    public void salvar(Categoria ent) {
        if(ent == null){
            throw new NullPointerException();
            }
        if(categorias.contains(ent)){
           throw new RuntimeException("Valor repetido");
       }
        ent.setId(lastId);
        lastId++;
        categorias.add(ent);
    }

    @Override
    public void atualizar(Categoria ent) {
        for(int i =0;i<categorias.size();i++){
            Categoria get = categorias.get(i);
            if(ent.getId() == get.getId() ){
               if(!categorias.contains(ent)){
                   categorias.set(i,ent);
                    } 
                }
            }
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < categorias.size(); i++) {
            Categoria get = categorias.get(i);
            if(get.getId()== id){
                categorias.remove(i);
                break;
                }
        }
    }

    @Override
    public List<Categoria> consultar() {
        return categorias;
    }
    
}
