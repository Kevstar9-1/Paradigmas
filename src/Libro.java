
import java.util.List;

public class Libro implements InterfaceLibro {

    private String titulo;

    private Autor autor;

    private String genero;

    private boolean disponible;

    private List<Categoria> categorias;

    private Editorial editoriales;

    private List<Critica> criticas;

    /**
     * 
     * @param titulo
     * @param autor
     * @param genero
     * @param disponible
     * @param categorias
     * @param editoriales
     * @param criticas 
     */
    public Libro(String titulo, Autor autor, String genero, boolean disponible, List<Categoria> categorias, Editorial editoriales, List<Critica> criticas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = disponible;
        this.categorias = categorias;
        this.editoriales = editoriales;
        this.criticas = criticas;
    }
    
    

    @Override
    public String getTitulo() {
        return titulo;
    }

    /**
     * 
     * @param titulo 
     */
    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public Autor getAutor() {
        return autor;
    }

    /**
     * 
     * @param autor 
     */
    @Override
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    /**
     * 
     * @param genero 
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    /**
     * 
     * @param disponible 
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    /**
     * 
     * @param categorias 
     */
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Editorial getEditoriales() {
        return editoriales;
    }

    /**
     * 
     * @param editoriales 
     */
    public void setEditoriales(Editorial editoriales) {
        this.editoriales = editoriales;
    }

    public List<Critica> getCriticas() {
        return criticas;
    }

    /**
     * 
     * @param criticas 
     */
    public void setCriticas(List<Critica> criticas) {
        this.criticas = criticas;
    }
    
}
