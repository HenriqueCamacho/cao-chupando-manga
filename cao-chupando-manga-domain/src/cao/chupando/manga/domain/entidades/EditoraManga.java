
package cao.chupando.manga.domain.entidades;

import java.util.Date;

/**
 *
 * @author henrique
 */
public class EditoraManga {
    private int d;
    private Date dataInicio;
    private Date dataFim;
    private Editora editora;
    private Manga manga;

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }

    
}
