package by.it.academy.example.dao.impl;

import by.it.academy.example.dao.DAO;
import by.it.academy.example.entity.lecture.RandomGenerate;
import by.it.academy.example.util.HibernateUtil;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;

public class RandomGenerateSeqDAOImpl implements DAO<RandomGenerate> {
    private EntityManager em;

    public EntityManager setEntityManager(EntityManager em){
        return this.em = em;
    }

    @Override
    public RandomGenerate save(RandomGenerate random) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            em.persist(random);
            em.getTransaction().commit();
            return random;
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
    public RandomGenerate find(RandomGenerate random) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            random = em.find(RandomGenerate.class, random.getUuId());
            em.getTransaction().commit();
            return random;
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
    public RandomGenerate delete(RandomGenerate random) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            random = em.find(RandomGenerate.class, random.getUuId());
            em.remove(random);
            em.getTransaction().commit();
            return random;
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
    public RandomGenerate update(RandomGenerate tc) {
        return null;
    }
}
