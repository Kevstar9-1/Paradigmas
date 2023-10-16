
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;

    private List<Prestamo> prestamos;

    private List<Equipo> equipos;

    public Biblioteca() {
    }

    /**
     * 
     * @param libros
     * @param prestamos
     * @param equipos 
     */
    public Biblioteca(List<Libro> libros, List<Prestamo> prestamos, List<Equipo> equipos) {
        this.libros = libros;
        this.prestamos = prestamos;
        this.equipos = equipos;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    
    
    /**
     * 
     * @param libro
     * @return 
     */
    public Libro registrarLibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * 
     * @param usuario
     * @return 
     */
    public Usuario registrarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * 
     * @param empleados
     * @return 
     */
    public Empleado registrarEmpleado(Empleado empleados) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * 
     * @param libro
     * @param usuario
     * @return 
     */
    public Usuario prestarLibro(Libro libro, Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * 
     * @param equipos
     * @param usuarios
     * @return equipo
     */
    public Usuario pretarEquipo(Equipo equipos, Usuario usuarios) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * 
     * @param titulo
     * @param autor
     * @param genero
     * @return libro (Es el libro que se esta buscando)
     */
    public String buscarLibro(String titulo, String autor, String genero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * 
     * @param titulo
     * @return 
     */
    public String buscarLibroTitulo(String titulo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * 
     * @param autor
     * @return 
     */
    public String buscarLibroAutor(String autor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * 
     * @param genero
     * @return 
     */
    public String buscarLibroGenero(String genero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
