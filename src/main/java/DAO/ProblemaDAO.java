package DAO;

import java.util.List;
import javax.persistence.*;
import objetos.Problema;

/**
 *
 * @author adria
 */
public class ProblemaDAO {
    
    private EntityManager em;

    public ProblemaDAO(EntityManager em) {
        this.em = em;
    }
    
    public List<Problema> buscarPorDescripcion(String palabra) {
        TypedQuery<Problema> query = em.createQuery(
                "SELECT p FROM Problema p WHERE p.descripcion LIKE :palabraClave",
                Problema.class
        );
        query.setParameter("palabra", "%" + palabra + "%");
        return query.getResultList();
    }
    
}
