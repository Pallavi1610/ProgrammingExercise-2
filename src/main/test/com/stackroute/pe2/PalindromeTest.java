package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
        Palindrome palindrome;
    @Before
    public void setUp() throws Exception {
        palindrome=new Palindrome();

    }

    @After
    public void tearDown() throws Exception {
        palindrome=null;
    }

    @Test
    public void checkPalindromeSuccess() {
        String result = palindrome.palindromeCheck("abcba");
        assertEquals("Palindrome",result);
    }

    @Test
    public void checkPalindromeFailure() {
        String result = palindrome.palindromeCheck("1546");
        assertEquals("Not a Palindrome",result);
    }

}