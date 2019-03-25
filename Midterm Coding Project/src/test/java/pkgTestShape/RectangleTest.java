package pkgTestShape;


import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	public void testGetter() {
		Rectangle Rec = new Rectangle(10, 20);
		assertEquals(10, Rec.getiWidth());
		assertEquals(20, Rec.getiLength());
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void whenExceptionThrown_thenExpectationSatisfied() {
		Rectangle Rec = new Rectangle(-10, 20);
	}
	

}
