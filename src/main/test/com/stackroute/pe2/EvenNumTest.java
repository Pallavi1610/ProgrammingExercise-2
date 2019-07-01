package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.EvenNum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    EvenNum num=null;

    @Before
    public void setUp() throws Exception {
        num=new EvenNum();
    }

    @After
    public void tearDown() throws Exception {
        num=null;
    }
    @Test
    public void checkIsEvenSuccess() {
        Boolean result= num.isEven(56);
        assertEquals(true,result);
    }

    @Test
    public void checkIsEvenFailure() {
        Boolean result = num.isEven(53);

        assertEquals(false,result);
    }
}