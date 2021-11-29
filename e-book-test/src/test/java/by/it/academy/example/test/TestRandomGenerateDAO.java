package by.it.academy.example.test;

import by.it.academy.example.dao.impl.ConstantRatingDAOImpl;
import by.it.academy.example.dao.impl.RandomGenerateCustomIdDAOImpl;
import by.it.academy.example.dao.impl.RandomGenerateSeqDAOImpl;
import by.it.academy.example.dao.impl.RandomGenerateUuidDAOImpl;
import by.it.academy.example.entity.lecture.ConstantRating;
import by.it.academy.example.entity.lecture.RandomGenerate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestRandomGenerateDAO {
    private RandomGenerateSeqDAOImpl dao1;
    private RandomGenerateCustomIdDAOImpl dao2;
    private RandomGenerateUuidDAOImpl dao3;
    private RandomGenerate random;

    @BeforeEach
    public void init(){
        dao1 = mock(RandomGenerateSeqDAOImpl.class);
        dao2 = mock(RandomGenerateCustomIdDAOImpl.class);
        dao3 = mock(RandomGenerateUuidDAOImpl.class);
        random = mock(RandomGenerate.class);
    }

    @Test
    public void testGetters(){
        Assertions.assertAll(
                ()->    Assertions.assertNull(random.getCustomId()),
                ()->    Assertions.assertNotNull(random.getSequenceId()),
                ()->    Assertions.assertNull(random.getUuId())
        );
    }

    @Test
    public void testSeqDAOUpdate(){
        Assertions.assertNull(dao1.update(random));
    }

    @Test
    public void testCustomDAOUpdate(){
        Assertions.assertNull(dao2.update(random));
    }

    @Test
    public void testUuIdDAOUpdate(){
        Assertions.assertNull(dao3.update(random));
    }

    @Test
    public void testSeqDAODelete(){
        when(dao1.delete(random)).thenReturn(random);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao1.delete(random)),
                ()-> Assertions.assertEquals(dao1.delete(random).getSequenceId(), random.getSequenceId())
        );
    }

    @Test
    public void testCustomDAODelete(){
        when(dao2.delete(random)).thenReturn(random);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao2.delete(random)),
                ()-> Assertions.assertEquals(dao2.delete(random).getCustomId(), random.getCustomId())
        );
    }

    @Test
    public void testDAODelete(){
        when(dao3.delete(random)).thenReturn(random);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao3.delete(random)),
                ()-> Assertions.assertEquals(dao3.delete(random).getUuId(), random.getUuId())
        );
    }


    @Test
    public void testSeqDAOSava(){
        when(dao3.save(random)).thenReturn(random);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao3.save(random)),
                ()-> Assertions.assertEquals(dao3.save(random).getUuId(), random.getUuId())
        );
    }

    @Test
    public void testCustomDAOSava(){
        when(dao2.save(random)).thenReturn(random);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao2.save(random)),
                ()-> Assertions.assertEquals(dao2.save(random).getCustomId(), random.getCustomId())
        );
    }

    @Test
    public void testUuIdDAOSava(){
        when(dao3.save(random)).thenReturn(random);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao3.save(random)),
                ()-> Assertions.assertEquals(dao3.save(random).getUuId(), random.getUuId())
        );
    }


    @Test
    public void testSeqDAOFind(){
        when(dao1.find(random)).thenReturn(random);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao1.find(random)),
                ()-> Assertions.assertEquals(dao1.find(random).getSequenceId(), random.getSequenceId())
        );
    }

    @Test
    public void testCustomDAOFind(){
        when(dao2.find(random)).thenReturn(random);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao2.find(random)),
                ()-> Assertions.assertEquals(dao2.find(random).getCustomId(), random.getCustomId())
        );
    }

    @Test
    public void testUuidDAOFind(){
        when(dao1.find(random)).thenReturn(random);
        Assertions.assertAll(
                ()-> Assertions.assertNotNull(dao1.find(random)),
                ()-> Assertions.assertEquals(dao1.find(random).getUuId(), random.getUuId())
        );
    }
}
