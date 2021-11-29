package by.it.academy.example.dbusers;

import by.it.academy.example.util.HibernateUtil;

import javax.persistence.EntityManager;

public class UsersPostgreSQL extends HibernateUtil {

    public static EntityManager getAdmin(){
        return HibernateUtil.getPostgresEntityManager("admin","root");
    }

    public static EntityManager getSubAdmin(){
        return HibernateUtil.getPostgresEntityManager("sub_admin","root");
    }

    public static EntityManager getReviewer(){
        return HibernateUtil.getPostgresEntityManager("reviewer","root");
    }

    public static EntityManager getSystem(){
        return HibernateUtil.getPostgresEntityManager("system","root");
    }

    public static void closePostgresEM(){
        HibernateUtil.closePostgresEM();
    }
}
