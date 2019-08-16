package cao.chupando.manga.domain.dao.postgresql;

import cao.chupando.manga.domain.dao.ICategoriaDAO;
import cao.chupando.manga.domain.entidades.Categoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


public class CategoriaDAOImplPostgreSQL implements ICategoriaDAO{

    private Connection criaConexao(){
        Connection conexao = null;//Conexao sempre tem que lançar uma excessão
        try{
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/manga","postgres","postgres");//5432 é a porta padrão do postgres
        }catch(Exception erro){
            erro.printStackTrace();
        }
        return conexao;
    }

    public void salvar(Categoria ent){
        Connection con = criaConexao();
        
        String sql = "Insert into categoria (nome)"
                + " Values('"+ent.getNome()+"')"; //Banco é necessário try catch
        try{
        con.createStatement().execute(sql);
        }catch(Exception erro){
            erro.printStackTrace();
            }
     }
    

    public void atualizar(Categoria ent){
        Connection con = criaConexao();
        String sql = "update categoria set "
                + "nome = ? where id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ent.getNome());//O 1 é o primeiro ponto de interrogação
            ps.setInt(2, ent.getId());
            ps.execute();
            ps.close();
            con.close();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> consultar() {
         try{//É obrigado toda vez que tiver uma conexão com um banco de dados
             List<Categoria> lista = new ArrayList<>();
             
             return lista;
         }catch(Exception erro){
             erro.printStackTrace();
            }
         return null;
    }
    
}
