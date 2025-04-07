package com.prgrm.github.githubprg;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
private App app;
public AppTest(String testname) {
	super(testname);
	this.app=new App();
}
public void testfact() {
	assertEquals("Factorial of0 must be 1",1,this.app.calculatefactorial(0));
}

public void testFact5() {
	assertEquals("Factorial of 5 must be 120",120,this.app.calculatefactorial(5));
}
}
