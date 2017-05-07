package com.phuchm.struts2.action;

import junit.framework.Assert;
import org.junit.Test;
// import org.apache.struts2.StrutsTestCase;

// import com.opensymphony.xwork2.ActionProxy;

public class TestAction {// extends StrutsTestCase {
	@Test
	public void testPrime() {// throws Exception {
		// ActionProxy proxy = getActionProxy("/login");
		// LoginAction loginAction = (LoginAction) proxy.getAction();
		// proxy.execute();

		Assert.assertEquals(HelloWorld.isPrime(5), true);
	}
}