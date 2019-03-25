package pkgTestShape;


import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class ShapeTest {
	
// TestGetters
	@Test
	public void testGetterRec() {
		Rectangle Rec = new Rectangle(10, 20);
		assertEquals(10, Rec.getiWidth());
		assertEquals(20, Rec.getiLength());
		
	}
	@Test
	public void testGetterCu() {
		Cuboid cu = new Cuboid(10,20,30);
		assertEquals(10,cu.getiWidth());
		assertEquals(20,cu.getiLength());
		assertEquals(30,cu.getiDepth());
	}
	
//TestConstractors	
	@Test(expected = IllegalArgumentException.class)
	public void whenExceptionThrown_thenExpectationSatisfied() {
		Rectangle Rec = new Rectangle(-10, 20);
	}
	@Test(expected = IllegalArgumentException.class)
	public void whenExceptionThrown_thenExpectationSatisfied_2() {
		Rectangle Rec = new Rectangle(10, -20);
	}
	@Test(expected = IllegalArgumentException.class)
	public void whenExceptionThrown_thenExpectationSatisfied_3() {
		Rectangle Rec = new Rectangle(-10, -20);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenExceptionThrown_thenExpectationSatisfied_Cuboid() {
		Cuboid cu = new Cuboid(10,20,-30);
	}
	
	
	
	 
	 

	

}
