package by.it.academy.example.dbusers;

import by.it.academy.example.util.HibernateUtil;

import javax.persistence.EntityManager;

public class UsersMongoDB extends HibernateUtil {

   public static EntityManager getAdmin(){
   return HibernateUtil.getMongoDbEntityManager("admin","root");
   }

   public static EntityManager getSubAdmin(){
      return HibernateUtil.getMongoDbEntityManager("sub_admin","root");
   }

   public static EntityManager getReviewer(){
      return HibernateUtil.getMongoDbEntityManager("reviewer","root");
   }

   public static EntityManager getAuthor(){
      return HibernateUtil.getMongoDbEntityManager("author","root");
   }

   public static EntityManager getUser(){
      return HibernateUtil.getMongoDbEntityManager("user","root");
   }

   public static EntityManager getSystem(){
      return HibernateUtil.getMongoDbEntityManager("system","root");
   }

   public static void closeMongoDbEM(){
      HibernateUtil.closeMongoDbEM();
   }
}
