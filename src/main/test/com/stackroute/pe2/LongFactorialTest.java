package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.LongFactorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongFactorialTest {
    LongFactorial fact;

    @Before
    public void setUp() throws Exception {
        fact=new LongFactorial();
    }

    @After
    public void tearDown() throws Exception {
        fact=null;
    }
    @Test
    public void TestFactSuccess() {
        int result = fact.factorial(5);
        assertEquals(120,result);
    }

    @Test
    public void TestFactFailure() {
        int result = fact.factorial(2);
        assertNotEquals(120,result);
    }

}