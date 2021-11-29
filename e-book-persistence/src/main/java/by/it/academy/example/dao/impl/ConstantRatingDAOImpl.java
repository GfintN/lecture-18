package by.it.academy.example.dao.impl;

import by.it.academy.example.dao.DAO;
import by.it.academy.example.entity.lecture.ConstantRating;
import by.it.academy.example.util.HibernateUtil;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;

public class ConstantRatingDAOImpl implements DAO<ConstantRating>{

    private EntityManager em;

    public EntityManager setEntityManager(EntityManager em){
        return this.em = em;
    }

    @Override
    public ConstantRating save(ConstantRating cr) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            em.persist(cr);
            em.getTransaction().commit();
            return cr;
        } catch (HibernateException ignore) {
            em.getTransaction().rollback();
            return null;
        }finally {
            if(em != null) {
                em.close();
            }
        }
    }

    @Override
    public ConstantRating find(ConstantRating cr) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            cr = em.find(ConstantRating.class, cr.getRating());
            em.getTransaction().commit();
            return cr;
        } catch (HibernateException ignore){
            em.getTransaction().rollback();
            return null;
        }
        finally {
            if(em != null) {
                em.close();
            }
        }
    }

    @Override
    public ConstantRating delete(ConstantRating cr) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            cr = em.find(ConstantRating.class, cr.getRating());
            em.remove(cr);
            em.getTransaction().commit();
            return cr;
        } catch (HibernateException ignore){
            em.getTransaction().rollback();
            return null;
        }
        finally {
            if(em != null) {
                em.close();
            }
        }
    }

    @Override
    public ConstantRating update(ConstantRating cr) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            cr = em.find(ConstantRating.class, cr.getRating());
            em.merge(cr);
            em.getTransaction().commit();
            return cr;
        } catch (HibernateException ignore){
            em.getTransaction().rollback();
            return null;
        }
        finally {
            if(em != null) {
                em.close();
            }
        }
    }
}
