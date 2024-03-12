package DAO;

import java.util.List;
import javax.persistence.*;
import objetos.Cliente;

/**
 *
 * @author adria
 */
public class ClienteDAO {

    private EntityManager entityManager;

    public ClienteDAO(EntityManager em) {
        this.entityManager = em;
    }

    public List<Cliente> buscarPorApellido(String letra) {
        TypedQuery<Cliente> query = entityManager.createQuery(
                "SELECT c FROM Cliente c WHERE c.ap_paterno LIKE :letraInicio OR c.ap_paterno LIKE :letraFin",
                Cliente.class
        );
        query.setParameter("letraInicio", letra + "%");
        query.setParameter("letraFin", "%" + letra);
        return query.getResultList();
    }
    
}
