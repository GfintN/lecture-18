package by.it.academy.example.dao.impl;

import by.it.academy.example.dao.DAO;
import by.it.academy.example.entity.lecture.Review;
import by.it.academy.example.util.HibernateUtil;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;

public class ReviewDAOImpl implements DAO<Review> {
    private EntityManager em;

    public EntityManager setEntityManager(EntityManager em){
        return this.em = em;
    }

    @Override
    public Review save(Review tc) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            em.persist(tc);
            em.getTransaction().commit();
            return tc;
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
    public Review find(Review review) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            review = em.find(Review.class, review.getId());
            em.getTransaction().commit();
            return review;
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
    public Review delete(Review review) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            review = em.find(Review.class, review.getId());
            em.remove(review);
            em.getTransaction().commit();
            return review;
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
    public Review update(Review review) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            review = em.find(Review.class, review.getId());
            em.merge(review);
            em.getTransaction().commit();
            return review;
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
