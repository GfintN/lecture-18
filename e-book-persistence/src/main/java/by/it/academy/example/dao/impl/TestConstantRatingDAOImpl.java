package by.it.academy.example.dao.impl;

import by.it.academy.example.dao.DAO;
import by.it.academy.example.entity.lecture.TestConstantRating;
import by.it.academy.example.util.HibernateUtil;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;

public class TestConstantRatingDAOImpl implements DAO<TestConstantRating> {
    private EntityManager em;

    public EntityManager setEntityManager(EntityManager em) {
        return this.em = em;
    }

    @Override
    public TestConstantRating save(TestConstantRating tc) {
        if (em == null) {
            em = HibernateUtil.getLectureEntityManager();
        }

        try {
            em.getTransaction().begin();
            em.persist(tc);
            em.getTransaction().commit();
            return tc;
        } catch (HibernateException ignore) {
            em.getTransaction().rollback();
            return null;
        } finally {
            if(em != null) {
                em.close();
            }
        }

    }

    @Override
    public TestConstantRating find(TestConstantRating tc) {
        if (em == null) {
            em = HibernateUtil.getLectureEntityManager();
        }

        try {
            em.getTransaction().begin();
            tc = em.find(TestConstantRating.class, tc.constantRating);
            em.getTransaction().commit();
            return tc;
        } catch (HibernateException ignore) {
            em.getTransaction().rollback();
            return null;
        } finally {
            if(em != null) {
                em.close();
            }
        }

    }

    @Override
    public TestConstantRating delete(TestConstantRating tc) {
        if (em == null) {
            em = HibernateUtil.getLectureEntityManager();
        }

        try {
            em.getTransaction().begin();
            tc = em.find(TestConstantRating.class, tc.getRating());
            em.remove(tc);
            em.getTransaction().commit();
            return tc;
        } catch (HibernateException ignore) {
            em.getTransaction().rollback();
            return null;
        } finally {
            if(em != null) {
                em.close();
            }
        }

    }

    @Override
    public TestConstantRating update(TestConstantRating tc) {
        if (em == null) {
            em = HibernateUtil.getLectureEntityManager();
        }

        try {
            em.getTransaction().begin();
            tc = em.find(TestConstantRating.class, tc.getRating());
            em.merge(tc);
            em.getTransaction().commit();
            return tc;
        } catch (HibernateException ignore) {
            em.getTransaction().rollback();
            return null;
        } finally {
            if(em != null) {
                em.close();
            }
        }
    }

}
