package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.MemberVariable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class MemberVariableTest {
MemberVariable variable;
    @Before
    public void setUp() throws Exception {
        variable=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        variable=null;
    }
    @Test
    public void printDetailsMember()
    {
        String result=variable.displayMemberValues("Pallavi",21,50000);
        assertEquals("Member's name:Pallavi"+"\n"+"Member's age:21"+"\n"+"Member's salary:50000.0",result);
    }
}