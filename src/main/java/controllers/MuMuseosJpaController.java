/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import persistence.MuMuseos;

/**
 *
 * @author PC
 */
public class MuMuseosJpaController {
    
    private EntityManagerFactory emf = null;
    
    public MuMuseosJpaController() {
        this.emf = Persistence.createEntityManagerFactory("MuseoAmericano");
    }
    
    
    public Collection<MuMuseos> findMuseoEntities() {
    return findMuseoEntities(true, -1, -1);
    }
    
    public EntityManagerFactory getEmf() {

        return emf;
    }
    
    private Collection<MuMuseos> findMuseoEntities(boolean all, int maxResult, int firstResult) {
    EntityManager em = this.getEmf().createEntityManager();
    try {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(MuMuseos.class));
        Query q = em.createQuery(cq);
        if (!all) {
            q.setMaxResults(maxResult);
            q.setFirstResult(firstResult);
        }
        return (Collection<MuMuseos>) q.getResultList();
    } finally {
        em.close();
    }
}


    
}

