package Shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	public void RectangleConstructorTest() {
	Rectangle rect = new Rectangle(2,5);
	assertTrue(rect instanceof Rectangle);
	}

	@Test
	public void getsetiWidthTest() {
		Rectangle rect = new Rectangle(2,5);
		rect.setiWidth(4);
		assertEquals(4, rect.getiWidth());
	}
	
	@Test
	public void getsetiLengthTest() {
		Rectangle rect = new Rectangle(2,5);
		rect.setiLength(16);
		assertEquals(16, rect.getiLength());
	}
	
	@Test
	public void areaTest() {
		Rectangle rectangle= new Rectangle(4,5);
		assertEquals(20,rectangle.area());
	}
	
	@Test 
	public void perimeterTest() {
		Rectangle rectangle= new Rectangle(5,3);
		assertEquals(16,rectangle.perimeter());
	}
	
	@Test
	public void comparetoTest() {
		Rectangle rect1 = new Rectangle(2,2);
		Rectangle rect2 = new Rectangle(4,6);
		assertEquals(-1,rect1.compareTo(rect2));
	}
	
	@Test
	public void comparetoTest2() {
		Rectangle rect1 = new Rectangle(8,10);
		Rectangle rect2 = new Rectangle(4,6);
		assertEquals(1,rect1.compareTo(rect2));
	}
	
	@Test
	public void comparetoTest3() {
		Rectangle rect1 = new Rectangle(2,2);
		Rectangle rect2 = new Rectangle(2,2);
		assertEquals(0,rect1.compareTo(rect2));
	}
}
