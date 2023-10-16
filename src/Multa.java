
import java.util.Date;

public class Multa {

    private int monto;

    private Usuario usuario;

    private Date fechaMulta;

    private Date fechaPago;

    private Date fechaVencimiento;

    private String comentario;

    /**
     * 
     * @param usuario
     * @param libro
     * @param monto
     * @return 
     */
    public double aplicarMulta(Usuario usuario, Libro libro, double monto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Multa() {
    }

    /**
     * 
     * @param monto
     * @param usuario
     * @param fechaMulta
     * @param fechaPago
     * @param fechaVencimiento
     * @param comentario 
     */
    public Multa(int monto, Usuario usuario, Date fechaMulta, Date fechaPago, Date fechaVencimiento, String comentario) {
        this.monto = monto;
        this.usuario = usuario;
        this.fechaMulta = fechaMulta;
        this.fechaPago = fechaPago;
        this.fechaVencimiento = fechaVencimiento;
        this.comentario = comentario;
    }

    public int getMonto() {
        return monto;
    }

    /**
     * 
     * @param monto 
     */
    public void setMonto(int monto) {
        this.monto = monto;
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

    public Date getFechaMulta() {
        return fechaMulta;
    }

    /**
     * 
     * @param fechaMulta 
     */
    public void setFechaMulta(Date fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    /**
     * 
     * @param fechaPago 
     */
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * 
     * @param fechaVencimiento 
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getComentario() {
        return comentario;
    }
    
    /**
     * 
     * @param comentario 
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}
