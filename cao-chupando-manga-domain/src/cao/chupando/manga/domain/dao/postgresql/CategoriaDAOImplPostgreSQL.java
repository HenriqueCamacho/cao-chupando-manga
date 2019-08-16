package cao.chupando.manga.domain.dao.postgresql;

import cao.chupando.manga.domain.dao.ICategoriaDAO;
import cao.chupando.manga.domain.entidades.Categoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public void remover(int id) {
        Connection con = criaConexao();
        
        String sql = "DELETE FROM categoria where categoria.id = "
                + "'"+id+"'"; //Banco é necessário try catch
        try{
        con.createStatement().execute(sql);
        }catch(Exception erro){
            erro.printStackTrace();
            }
    }

    @Override
    public List<Categoria> consultar() {
       Connection con = criaConexao();
        
        try{
        List<Categoria> lista = new ArrayList<>();
        String sql = "select * from categoria";
        //Só atem acesso ao primeiro elemento da lista
        ResultSet res = con.createStatement().executeQuery(sql);//Classe que retorna os dados através de uma lista encadeada
        while(res.next()){//enquanto tiver elemento nesse cursor
            Categoria c = new Categoria();
            c.setId(res.getInt("id"));//Passa o nome da coluna
            c.setNome(res.getString("nome"));
            lista.add(c);
            
        }
        
        return lista;
        }catch(Exception erro){
            erro.printStackTrace();
            }
        return null;
    }
    
}
