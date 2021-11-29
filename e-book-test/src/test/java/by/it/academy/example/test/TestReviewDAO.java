package by.it.academy.example.test;

import by.it.academy.example.dao.impl.ReviewDAOImpl;
import by.it.academy.example.entity.lecture.Review;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestReviewDAO {
    private ReviewDAOImpl dao;
    private Review review;

    @BeforeEach
    public void init(){
        dao = mock(ReviewDAOImpl.class);
        review = mock(Review.class);
    }

    @Test
    public void testGetters(){
        when(review.getMassage()).thenReturn("hello");
        Assertions.assertAll(
                ()-> Assertions.assertNull(review.getRating()),
                ()-> Assertions.assertNotNull(review.getId()),
                ()-> Assertions.assertNotNull(review.getBookId()),
                ()-> Assertions.assertNotNull(review.getMassage()),
                ()-> Assertions.assertEquals(review.getMassage(),"hello")
        );

    }

    @Test
    public void testDAOSava(){
        when(dao.save(review)).thenReturn(review);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.save(review)),
                ()-> Assertions.assertEquals(dao.save(review).getRating(), review.getRating())
        );
    }

    @Test
    public void testDAOUpdate(){
        when(dao.update(review)).thenReturn(review);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.update(review)),
                ()-> Assertions.assertEquals(dao.update(review).getRating(), review.getRating())
        );
    }

    @Test
    public void testDAODelete(){
        when(dao.delete(review)).thenReturn(review);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.delete(review)),
                ()-> Assertions.assertEquals(dao.delete(review).getRating(), review.getRating())
        );
    }

    @Test
    public void testDAOFind(){
        when(dao.find(review)).thenReturn(review);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao.find(review)),
                ()-> Assertions.assertEquals(dao.find(review).getRating(), review.getRating())
        );
    }
}
