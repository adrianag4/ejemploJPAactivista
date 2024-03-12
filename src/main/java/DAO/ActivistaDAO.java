package DAO;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.*;
import objetos.Activista;

/**
 *
 * @author adria
 */
public class ActivistaDAO {
    
    private EntityManager entityManager;

    public ActivistaDAO(EntityManager em) {
        this.entityManager = em;
    }
    
    public List<Activista> buscarPorFecha() {
        Calendar fechaInicio = new GregorianCalendar(2024, Calendar.JANUARY, 1);
        Calendar fechaFin = new GregorianCalendar(2024, Calendar.MARCH, 31);
        
        TypedQuery<Activista> query = entityManager.createQuery(
                "SELECT a FROM Activista a WHERE a.fechaInicioLabores BETWEEN :fechaInicio AND :fechaFin",
                Activista.class
        );
        query.setParameter("fechaInicio", fechaInicio);
        query.setParameter("fechaFin", fechaFin);
        return query.getResultList();
    }
    
}
