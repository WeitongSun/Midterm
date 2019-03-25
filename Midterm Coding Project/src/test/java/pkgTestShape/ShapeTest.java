package pkgTestShape;

import static org.junit.Assert.assertEquals;

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
		Rectangle R = new Rectangle(-10, 20);
	}
	@Test(expected = IllegalArgumentException.class)
	public void whenExceptionThrown_thenExpectationSatisfied_2() {
		Rectangle e = new Rectangle(10, -20);
	}
	@Test(expected = IllegalArgumentException.class)
	public void whenExceptionThrown_thenExpectationSatisfied_3() {
		Rectangle c = new Rectangle(-10, -20);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenExceptionThrown_thenExpectationSatisfied_Cuboid() {
		Cuboid cu = new Cuboid(10,20,-30);
	}
	
	//TestSetters
	@Test
	public void testSetterRec() {
		Rectangle rec = new Rectangle(10,20);
		
		rec.setiWidth(20);
		rec.setiLength(30);
		
		assertEquals(20, rec.getiWidth());
		assertEquals(30, rec.getiLength());
	}
	
	@Test
	public void testSettersCu() {
	  Cuboid b = new Cuboid(10,20,30);
	  
	  b.setiWidth(20);
	  b.setiLength(40);
	  b.setiDepth(10);
	  
	  assertEquals(20,b.getiWidth());
	  assertEquals(40,b.getiLength());
	  assertEquals(10,b.getiDepth());
	 }
	
	//TestArea
	/*
	@Test
	public void testAreaRec() {
		Rectangle recArea = new Rectangle(30,20);
		assertEquals(600, recArea.area());
	
	}

	@Test
	public void testarea() {
	  Cuboid b = new Cuboid(2,2,2);
	  assertEquals(24,b.area());
	 }*/

	
	 
	 

	

}
