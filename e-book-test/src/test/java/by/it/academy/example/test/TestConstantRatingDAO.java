package by.it.academy.example.test;

import by.it.academy.example.dao.impl.ConstantRatingDAOImpl;
import by.it.academy.example.entity.lecture.ConstantRating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestConstantRatingDAO {
    private ConstantRatingDAOImpl dao;
    private ConstantRating rating;

    @BeforeEach
    public void init(){
        dao = mock(ConstantRatingDAOImpl.class);
        rating = mock(ConstantRating.class);
    }

    @Test
    public void testGetters(){
        Assertions.assertNotNull(rating.getRating());
    }

    @Test
    public void testDAOSava(){
        when(dao.save(rating)).thenReturn(rating);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.save(rating)),
                ()-> Assertions.assertEquals(dao.save(rating).getRating(), rating.getRating())
        );
    }

    @Test
    public void testDAOUpdate(){
        when(dao.update(rating)).thenReturn(rating);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.update(rating)),
                ()-> Assertions.assertEquals(dao.update(rating).getRating(), rating.getRating())
        );
    }

    @Test
    public void testDAODelete(){
        when(dao.delete(rating)).thenReturn(rating);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.delete(rating)),
                ()-> Assertions.assertEquals(dao.delete(rating).getRating(), rating.getRating())
        );
    }

    @Test
    public void testDAOFind(){
        when(dao.find(rating)).thenReturn(rating);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.find(rating)),
                ()-> Assertions.assertEquals(dao.find(rating).getRating(), rating.getRating())
        );
    }
}
