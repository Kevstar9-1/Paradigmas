public class Equipo implements InterfaceEquipo {

    private String nombre;

    private String tipo;

    private boolean disponible;

    private int cantidad;

    public Equipo() {
    }

    public Equipo(String nombre, String tipo, boolean disponible, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.disponible = disponible;
        this.cantidad = cantidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
