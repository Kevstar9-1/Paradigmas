
import java.util.List;

public class Usuario extends Persona {

    private List<Multa> multas;

    public Usuario() {
    }

    /**
     * 
     * @param multas 
     */
    public Usuario(List<Multa> multas) {
        this.multas = multas;
    }

    /**
     * 
     * @param multas
     * @param id
     * @param nombre
     * @param telefono
     * @param correo
     * @param direccion 
     */
    public Usuario(List<Multa> multas, String id, String nombre, String telefono, String correo, String direccion) {
        super(id, nombre, telefono, correo, direccion);
        this.multas = multas;
    }

    public List<Multa> getMultas() {
        return multas;
    }
/**
 * 
 * @param multas 
 */
    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }
    
    
}
