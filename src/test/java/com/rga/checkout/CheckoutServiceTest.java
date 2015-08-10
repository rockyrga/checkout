package com.rga.checkout;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * Apple : $20
 * Banana: $30
 * Citrus: $50
 * Durian: $100
 * 
 *
 */

public class CheckoutServiceTest {

	private CheckoutService checkoutService;
	
	@Before
	public void setUp() {
		
		this.checkoutService = new CheckoutService();
	}
	
	@Test	
	public void testCheckoutBuyNothing() {
		
		assertEquals(0, checkoutService.checkout(""));
	}
}
