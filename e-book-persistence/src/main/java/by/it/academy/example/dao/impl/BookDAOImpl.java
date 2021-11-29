package by.it.academy.example.dao.impl;

import by.it.academy.example.dao.DAO;
import by.it.academy.example.entity.lecture.Book;
import by.it.academy.example.util.HibernateUtil;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;

public class BookDAOImpl implements DAO<Book> {
    private EntityManager em;

    public EntityManager setEntityManager(EntityManager em){
        return this.em = em;
    }

    @Override
    public Book save(Book book) {
        if(em == null){
        em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            em.persist(book);
            em.getTransaction().commit();
            return book;
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
    public Book find(Book book) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            book = em.find(Book.class, book.getId());
            em.getTransaction().commit();
            return book;
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
    public Book delete(Book book) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            book = em.find(Book.class, book.getId());
            em.remove(book);
            em.getTransaction().commit();
            return book;
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
    public Book update(Book book) {
        if(em == null){
            em = HibernateUtil.getLectureEntityManager();}
        try {
            em.getTransaction().begin();
            book = em.find(Book.class, book.getId());
            em.merge(book);
            em.getTransaction().commit();
            return book;
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
