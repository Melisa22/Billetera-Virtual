package ar.com.ada.billeteravirtual;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Cuenta
 */
@Entity
@Table (name= "cuenta")

public class Cuenta {

  
    @Id
    @Column (name = "cuenta_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer cuentaId;

    public String moneda;
    public double saldo;
    @Column (name = "saldo_disponible")
    public double saldoDisponible;

    @ManyToOne // estas dos anotaciones van siempre que esten en la tabla de FK o @onetomany
    @JoinColumn(name = "billetera_id", referencedColumnName = "billetera_id")
    private Billetera billetera;
    //Falta billetera

    @OneToMany (mappedBy = "cuenta", cascade = CascadeType.ALL)
    private List<Movimiento> movimientos = new ArrayList<Movimiento>();
    // private Movimiento movimiento;



    public Integer getCuentaId(){
        return cuentaId;
    }

    public void setCuentaId(Integer cuentaId){
        this.cuentaId = cuentaId;
    }

    public String getMoneda(){
        return moneda;
    }

    public void setMoneda(String moneda){
        this.moneda = moneda;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldoDisponible(){
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible){
        this.saldoDisponible = saldoDisponible;
    }

    
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }
        
  public void agregarMovimiento (Movimiento movimiento) {

        movimiento.setCuenta(this);
        movimientos.add(movimiento);

        this.setSaldo(this.getSaldo() + movimiento.getImporte());
        this.setSaldoDisponible(this.getSaldo());

    }


}