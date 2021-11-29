package by.it.academy.example.test;

import by.it.academy.example.dao.impl.TestConstantRatingDAOImpl;
import by.it.academy.example.entity.lecture.TestConstantRating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestTestConstantRatingDAO {
    private TestConstantRatingDAOImpl dao;
    private TestConstantRating testConst;

    @BeforeEach
    public void init(){
        dao = mock(TestConstantRatingDAOImpl.class);
        testConst = mock(TestConstantRating.class);
    }

    @Test
    public void testGetters(){
        Assertions.assertNotNull(testConst.getRating());
    }

    @Test
    public void testDAOSava(){
        when(dao.save(testConst)).thenReturn(testConst);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.save(testConst)),
                ()-> Assertions.assertEquals(dao.save(testConst).getRating(), testConst.getRating())
        );
    }

    @Test
    public void testDAOUpdate(){
        when(dao.update(testConst)).thenReturn(testConst);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.update(testConst)),
                ()-> Assertions.assertEquals(dao.update(testConst).getRating(), testConst.getRating())
        );
    }

    @Test
    public void testDAODelete(){
        when(dao.delete(testConst)).thenReturn(testConst);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.delete(testConst)),
                ()-> Assertions.assertEquals(dao.delete(testConst).getRating(), testConst.getRating())
        );
    }

    @Test
    public void testDAOFind(){
        when(dao.find(testConst)).thenReturn(testConst);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.find(testConst)),
                ()-> Assertions.assertEquals(dao.find(testConst).getRating(), testConst.getRating())
        );
    }
}
