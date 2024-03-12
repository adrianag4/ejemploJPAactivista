package com.mycompany.ejmplojpaactivista;

import DAO.ActivistaDAO;
import DAO.ClienteDAO;
import DAO.ProblemaDAO;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetos.Activista;
import objetos.Cliente;
import objetos.Direccion;
import objetos.Problema;

/**
 *
 * @author Laboratorios
 */
public class EjmploJPAactivista {

    public static void main(String[] args) {
        
        EntityManagerFactory mf = Persistence.createEntityManagerFactory("unidadPersistencia");
        EntityManager em = mf.createEntityManager();
        em.getTransaction().begin();

//        //CREAR ACTIVISTA
//        Activista activista = new Activista("Ramiro", "Perez", "López", "6442789898", new GregorianCalendar(2020,1,15));
//        em.persist(activista);
//        em.getTransaction().commit();

    
//        //BUSCAR Y ACTUALIZAR
//        Activista a = em.find(Activista.class, 1L);
//        if( a!= null){
//            a.setAp_materno("Dominguez");
//            a.setTelefono("6442112147");
//            em.persist(a);
//        }
//        else{
//            System.out.println("Activista no encontrado");
//        }
//        em.getTransaction().commit();

//        //ELIMINAR    
//        Activista a = em.find(Activista.class, 2L);
//        if( a!= null){
//            em.remove(a);
//        }else{
//            System.out.println("Activista no encontrado :)");
//        }
//        em.getTransaction().commit();
        
//        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
//        criteria.select(criteria.from(Activista.class));
//        Query query = em.createQuery(criteria);
//        List<Activista> activistas = query.getResultList();
//        
//        for (Activista activista: activistas) {
//            System.out.println(activista.toString());
//        }
//        em.getTransaction().commit();
        
//         Cliente c = new Cliente();
//         c.setNombres("Ariana");
//         c.setAp_paterno("Grande");
//         c.setAp_materno("Butera");
//         
//         Direccion d = new Direccion("eternal sunshine","yes, and?",85000L,     455L, c);
//         
//         List<Direccion> ds = new ArrayList();
//         ds.add(d);
//         c.setDirecciones(ds);
//         em.persist(c);
//         em.getTransaction().commit();
        
//            
//            Cliente c = new Cliente();
//            c.setNombres("");
//            c.setAp_paterno("");
//            c.setAp_materno("");

        
        // Buscar una lista de Problemas cuyo nombre que contengan la palabra ‘Contaminación’. 
        ProblemaDAO problemaDAO = new ProblemaDAO(em);
        
        List<Problema> pContaminacion = problemaDAO.buscarPorDescripcion("Contaminación");
        System.out.println("Problemas que contienen la palabra 'Contaminación':");
        for (Problema problema : pContaminacion) {
            System.out.println(problema);
        }
        em.close();
           
        
        //Buscar una lista de Clientes que su apellido inicie o termine con la letra A
        ClienteDAO clienteDAO = new ClienteDAO(em);
        
        List<Cliente> clientesConA = clienteDAO.buscarPorApellido("A");
        System.out.println("Clientes cuyo apellido inicia o termina con la letra 'A':");
        for (Cliente cliente : clientesConA) {
            System.out.println(cliente);
        }
        em.close();
        
        
        //Buscar una lista de Activistas que hayan entrado entre enero del año 2024 y marzo del 2024.
        ActivistaDAO activistaDAO = new ActivistaDAO(em);
        
        List<Activista> activistas = activistaDAO.buscarPorFecha();
        System.out.println("Activistas que han entrado entre enero y marzo del año 2024:");
        for (Activista activista : activistas) {
            System.out.println(activista);
        }
        em.close();


    }
}
