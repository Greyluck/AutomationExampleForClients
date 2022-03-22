package com.example.ionate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;

public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
     //   double result=App.calculateSimpleInterest(10000,5,7);
     //   Assert.assertEquals("Test failed. ",35000.0,result);

        boolean ionateWebPageResult = App.returnWebTestResult();
        Assert.assertTrue("Test failed. ", ionateWebPageResult);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
