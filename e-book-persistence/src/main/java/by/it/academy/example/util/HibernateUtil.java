package by.it.academy.example.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Properties;

public class HibernateUtil {
    private static EntityManagerFactory emFactoryLecture;
    static {
        emFactoryLecture = Persistence.createEntityManagerFactory("lecture18");
    }
    private static EntityManagerFactory emFactoryPostgres;
    private static EntityManagerFactory emFactoryMongoDB;

    public static EntityManager getLectureEntityManager(){
        return  emFactoryLecture.createEntityManager();
    }
    protected static EntityManager getPostgresEntityManager(String username, String password){
        Properties prop = new Properties();
        prop.setProperty("hibernate.hikari.dataSource.user", username);
        prop.setProperty("hibernate.hikari.dataSource.password", password);
        emFactoryPostgres = Persistence.createEntityManagerFactory("postgresql.e-book-shop",prop);
        return emFactoryPostgres.createEntityManager();
    }
    protected static EntityManager getMongoDbEntityManager(String username, String password){
        Properties prop = new Properties();
        prop.setProperty("hibernate.hikari.dataSource.user", username);
        prop.setProperty("hibernate.hikari.dataSource.password", password);
        emFactoryMongoDB = Persistence.createEntityManagerFactory("mongodb.e-book-shop",prop);
        return emFactoryMongoDB.createEntityManager();
    }
    protected static void closePostgresEM(){
        emFactoryPostgres.close();
    }
    protected static void closeMongoDbEM(){
        emFactoryMongoDB.close();
    }

    public static EntityManagerFactory getEmFactoryPostgres() {
        return emFactoryPostgres;
    }

    public static EntityManagerFactory getEmFactoryMongoDB() {
        return emFactoryMongoDB;
    }
}

