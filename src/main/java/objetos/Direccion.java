package objetos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

/**
 *
 * @author Laboratorios
 */
@Entity
@Table (name="direccion")
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;
    private String colonia;
    private Long codigoPostal;
    private Long numeroExterior;
    @ManyToOne
    @JoinColumn(name="idCliente")
    private Cliente cliente;

    public Long getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Long codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Long getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(Long numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Direccion() {
    }

    public Direccion(Long id) {
        this.id = id;
    }

    public Direccion(String calle, String colonia, Long codigoPostal, Long numeroExterior, Cliente cliente) {
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.numeroExterior = numeroExterior;
        this.cliente = cliente;
    }

    public Direccion(Long id, String calle, String colonia, Long codigoPostal, Long numeroExterior, Cliente cliente) {
        this.id = id;
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.numeroExterior = numeroExterior;
        this.cliente = cliente;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetos.Direccion[ id=" + id + " ]";
    }
    
}
