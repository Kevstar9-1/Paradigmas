
import java.util.Date;

public class Prestamo implements InterfaceEquipo, InterfaceLibro {

    private Libro libro;

    private Usuario usuario;

    private Date fechaPrestado;

    private Date fechaDevolucion;

    private boolean estado;

    private Equipo equipo;

    public Prestamo() {
    }

    /**
     * 
     * @param libro
     * @param usuario
     * @param fechaPrestado
     * @param fechaDevolucion
     * @param estado
     * @param equipo 
     */
    public Prestamo(Libro libro, Usuario usuario, Date fechaPrestado, Date fechaDevolucion, boolean estado, Equipo equipo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestado = fechaPrestado;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
        this.equipo = equipo;
    }

    public Libro getLibro() {
        return libro;
    }

    /**
     * 
     * @param libro 
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * 
     * @param usuario 
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPrestado() {
        return fechaPrestado;
    }

    /**
     * 
     * @param fechaPrestado 
     */
    public void setFechaPrestado(Date fechaPrestado) {
        this.fechaPrestado = fechaPrestado;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * 
     * @param fechaDevolucion 
     */
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isEstado() {
        return estado;
    }

    /**
     * 
     * @param estado 
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * 
     * @param equipo 
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    

    /**
     * 
     * @return 
     */
    @Override
    public Autor getAutor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getTitulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param autor 
     */
    @Override
    public void setAutor(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param titulo 
     */
    @Override
    public void setTitulo(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param nombre 
     */
    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param tipo 
     */
    @Override
    public void setTipo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
