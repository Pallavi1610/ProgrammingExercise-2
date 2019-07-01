package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.PowerOf4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PowerOf4Test {
   PowerOf4 power=null;
    @Before
    public void setUp() throws Exception {
        power=new PowerOf4();
    }

    @After
    public void tearDown() throws Exception {
        power=null;
    }
    @Test
    public void checkPowerOfFourSuccess() {
        String result= power.checkPowerOfFour(256);
        assertEquals("Number is a power of 4",result);
    }

    @Test
    public void checkPowerOfFourFailure() {
        String result= power.checkPowerOfFour(150);
        assertEquals("Number is not a power of 4",result);

    }


}