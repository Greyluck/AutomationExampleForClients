package com.ionate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     * @param testName name of the test case
     */
    public AppTest( String testName ) throws InterruptedException {
        super( testName );

        boolean ionateWebPageResult = App.returnWebTestResult();
        assertTrue("Test failed. ", ionateWebPageResult);
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