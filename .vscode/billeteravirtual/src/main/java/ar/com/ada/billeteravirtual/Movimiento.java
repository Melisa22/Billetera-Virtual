package ar.com.ada.billeteravirtual;

import java.util.Date;

import javax.persistence.*;

/**
 * Movimientos
 */
@Entity
@Table (name = "movimiento")
public class Movimiento {

    @Id
    @Column(name = "movimiento_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movimientoId;
    private Date fechaMovimiento;
    private double importe;
    private String tipoOperacion;
    private String conceptoOperacion;
    private String detalle;
    private int estado;
    @Column(name = "deUsuario_id")
    private int deUsuarioId;
    @Column(name = "aUsuario_id")
    private int aUsuarioId;
    @Column(name = "cuentaDestino_id")
    private int cuentaDestinoId;
    @Column(name = "cuentaOrigen_id")
    private int cuentaOrigenId;

    @ManyToOne
    @JoinColumn (name = "cuenta_id", referencedColumnName = "cuenta_id")
    private Cuenta cuenta;

    

    public Movimiento(int movimientoId, Date fechaMovimiento, double importe, String tipoOperacion,
            String conceptoOperacion, String detalle, int estado, int deUsuarioId, int aUsuarioId, int cuentaDestinoId,
            int cuentaOrigenId) {
        this.movimientoId = movimientoId;
        this.fechaMovimiento = fechaMovimiento;
        this.importe = importe;
        this.tipoOperacion = tipoOperacion;
        this.conceptoOperacion = conceptoOperacion;
        this.detalle = detalle;
        this.estado = estado;
        this.deUsuarioId = deUsuarioId;
        this.aUsuarioId = aUsuarioId;
        this.cuentaDestinoId = cuentaDestinoId;
        this.cuentaOrigenId = cuentaOrigenId;
    }

    public Movimiento() {
    }


    public int getMovimientoId() {
        return movimientoId;
    }

    public void setMovimientoId(int movimientoId) {
        this.movimientoId = movimientoId;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getConceptoOperacion() {
        return conceptoOperacion;
    }

    public void setConceptoOperacion(String conceptoOperacion) {
        this.conceptoOperacion = conceptoOperacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getDeUsuarioId() {
        return deUsuarioId;
    }

    public void setDeUsuarioId(int deUsuarioId) {
        this.deUsuarioId = deUsuarioId;
    }

    public int getaUsuarioId() {
        return aUsuarioId;
    }

    public void setaUsuarioId(int aUsuarioId) {
        this.aUsuarioId = aUsuarioId;
    }

    public int getCuentaDestinoId() {
        return cuentaDestinoId;
    }

    public void setCuentaDestinoId(int cuentaDestinoId) {
        this.cuentaDestinoId = cuentaDestinoId;
    }

    public int getCuentaOrigenId() {
        return cuentaOrigenId;
    }

    public void setCuentaOrigenId(int cuentaOrigenId) {
        this.cuentaOrigenId = cuentaOrigenId;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
}
