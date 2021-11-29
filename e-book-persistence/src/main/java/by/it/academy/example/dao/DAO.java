package by.it.academy.example.dao;

public interface DAO<T> {
    T save (T pojo);
    T find(T pojo);
    T delete(T pojo);
    T update(T pojo);
}
