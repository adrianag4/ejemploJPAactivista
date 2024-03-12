package objetos;

import javax.persistence.Column;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Laboratorios
 */
@Entity
@Table(name="activista")
public class Activista implements Serializable {

    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    private String nombres;
//    @Column(name="ap_paterno")
    private String ap_paterno;
//    @Column(name="ap_materno")
    private String ap_materno;
    @Column(name="teléfono", unique=true)
    private String telefono;
    
    private Calendar fechaInicioLabores;

    public Activista() {
    }

    public Activista(Long id) {
        this.id = id;
    }

    public Activista(Long id, String nombre, String ap_paterno, String ap_materno, String telefono, Calendar fechaInicioLabores) {
        this.id = id;
        this.nombres = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.telefono = telefono;
        this.fechaInicioLabores = fechaInicioLabores;
    }

    public Activista(String nombre, String ap_paterno, String ap_materno, String telefono, Calendar fechaInicioLabores) {
        this.nombres = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.telefono = telefono;
        this.fechaInicioLabores = fechaInicioLabores;
    } 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Calendar getFechaInicioLabores() {
        return fechaInicioLabores;
    }

    public void setFechaInicioLabores(Calendar fechaInicioLabores) {
        this.fechaInicioLabores = fechaInicioLabores;
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
        if (!(object instanceof Activista)) {
            return false;
        }
        Activista other = (Activista) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Activista{" + "id=" + id + ", nombres=" + nombres + ", ap_paterno=" + ap_paterno + ", ap_materno=" + ap_materno + ", telefono=" + telefono + ", fechaInicioLabores=" + fechaInicioLabores + '}';
    }

    
    
}
