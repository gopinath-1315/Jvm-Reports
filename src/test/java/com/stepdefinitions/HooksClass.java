
package com.stepdefinitions;

import com.baseclasses.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public void beforeclass() {
		System.out.println("welcome");
		browserLaunch();

	}

	@After
	public void afterclass() throws InterruptedException {
		
		System.out.println("goodbye");
		

	}
}
