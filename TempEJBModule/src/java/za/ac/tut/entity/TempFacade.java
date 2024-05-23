/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.entity;

import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author yolan
 */
@Stateless
public class TempFacade extends AbstractFacade<Temp> implements TempFacadeLocal {

    @PersistenceContext(unitName = "TempEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TempFacade() {
        super(Temp.class);
    }

    @RolesAllowed("manager")
    @Override
    public void removeByName(String name) {
       Query query = em.createQuery("DELETE FROM Temp t WHERE t.name = :name");
       query.setParameter("name", name);
       query.executeUpdate();
    }
    
    @RolesAllowed("manager")
    @Override
    public List<Temp> findStudentsWithMultipleModules() {
        TypedQuery<Temp> query = em.createQuery(
            "SELECT t FROM Temp t " +
            "WHERE t.id IN ( " +
            "    SELECT t0.id " +
            "    FROM Temp t0 JOIN t0.tamp m " +
            "    GROUP BY t0.id, t0.name " + // List all non-BLOB columns you need in GROUP BY
            "    HAVING COUNT(m) > 1 " +
            ")", Temp.class);
        return query.getResultList();
    }


    @RolesAllowed({"manager", "employee"})
    @Override
    public void createTemp(Temp temp) {
       if (temp != null) {
            em.persist(temp);
        } else {
            throw new IllegalArgumentException("Temp cannot be null");
        }
    }

    @RolesAllowed({"manager", "employee"})
    @Override
    public void editTemp(Temp temp) {
         if (temp != null && temp.getId() != null) {
            Temp existingTemp = em.find(Temp.class, temp.getId());
            if (existingTemp != null) {
                em.merge(temp);
            } else {
                throw new IllegalArgumentException("Temp entity does not exist");
            }
        } else {
            throw new IllegalArgumentException("Temp or Temp ID cannot be null");
        }
    }

    @RolesAllowed({"manager", "employee"})
    @Override
    public void removeTemp(Temp temp) {
        if (temp != null && temp.getId() != null) {
            Temp existingTemp = em.find(Temp.class, temp.getId());
            if (existingTemp != null) {
                em.remove(existingTemp);
            } else {
                throw new IllegalArgumentException("Temp entity does not exist");
            }
        } else {
            throw new IllegalArgumentException("Temp or Temp ID cannot be null");
        }
    }
    
}
