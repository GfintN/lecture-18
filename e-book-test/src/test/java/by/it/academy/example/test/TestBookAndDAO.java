package by.it.academy.example.test;

import by.it.academy.example.dao.impl.BookDAOImpl;
import by.it.academy.example.entity.lecture.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestBookAndDAO {
    private BookDAOImpl dao;
    private Book book;

    @BeforeEach
    public void init(){
        dao = mock(BookDAOImpl.class);
        book = mock(Book.class);
    }

    @Test
    public void testGetters(){
        when(book.getName()).thenReturn("x");
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(book.getName()),
                ()-> Assertions.assertNotNull(book.getId())
        );
    }

    @Test
    public void testDAOSava(){
        when(dao.save(book)).thenReturn(book);
        when(book.getName()).thenReturn("X");
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.save(book)),
                ()-> Assertions.assertEquals(dao.save(book).getName(), book.getName())
        );
    }

    @Test
    public void testDAOUpdate(){
        when(dao.update(book)).thenReturn(book);
        when(book.getName()).thenReturn("X");
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.update(book)),
                ()-> Assertions.assertEquals(dao.update(book).getName(), book.getName())
        );
    }

    @Test
    public void testDAODelete(){
        when(dao.delete(book)).thenReturn(book);
        when(book.getName()).thenReturn("X");
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.delete(book)),
                ()-> Assertions.assertEquals(dao.delete(book).getName(), book.getName())
        );
    }

    @Test
    public void testDAOFind(){
        when(dao.find(book)).thenReturn(book);
        when(book.getName()).thenReturn("X");
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.find(book)),
                ()-> Assertions.assertEquals(dao.find(book).getName(), book.getName())
        );
    }


}
