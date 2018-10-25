package Shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CuboidTest {

	@Test
	public void CuboidConstructorTest() {
		Cuboid c = new Cuboid(2,2,2);
		assertTrue(c instanceof Cuboid);
	}

	@Test
	public void getsetiDepthTest() {
		Cuboid c = new Cuboid(2,3,4);
		c.setiDepth(5);
		assertEquals(5,c.getiDepth());
	}
	
	@Test
	public void areaTest() {
		Cuboid c = new Cuboid(3,7,4);
		assertEquals(122,c.area());
	}
	
	@Test 
	public void perimeterTest() {
		Cuboid c= new Cuboid(3,6,4);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> {c.perimeter();});
	}
	
	@Test
	public void volumeTest() {
		Cuboid c = new Cuboid(7,2,5);
		assertEquals(70,c.volume());
	}
	
	@Test
	public void SortByAreaTest() {
		Cuboid c1 = new Cuboid(2,3,4);
		Cuboid c2 = new Cuboid(1,2,3);
		Cuboid.SortByArea sorted = c1. new SortByArea();
		assertEquals(-1, sorted.compare(c1, c2));
	}
	
	@Test
	public void SortByAreaTest2() {
		Cuboid c1 = new Cuboid(1,2,3);
		Cuboid c2 = new Cuboid(1,2,3);
		Cuboid.SortByArea sorted = c1. new SortByArea();
		assertEquals(0, sorted.compare(c1, c2));
	}
	
	@Test
	public void SortByAreaTest3() {
		Cuboid c1 = new Cuboid(1,1,1);
		Cuboid c2 = new Cuboid(1,2,3);
		Cuboid.SortByArea sorted = c1. new SortByArea();
		assertEquals(1, sorted.compare(c1, c2));
	}
	
	@Test
	public void SortByVolumeTest() {
		Cuboid c1 = new Cuboid(2,3,4);
		Cuboid c2 = new Cuboid(2,3,4);
		Cuboid.SortByVolume sorted = c1. new SortByVolume();
		assertEquals(0, sorted.compare(c1, c2));
	}
	
	@Test
	public void SortByVolumeTest2() {
		Cuboid c1 = new Cuboid(5,3,4);
		Cuboid c2 = new Cuboid(2,3,4);
		Cuboid.SortByVolume sorted = c1. new SortByVolume();
		assertEquals(1, sorted.compare(c1, c2));
	}
	
	@Test
	public void SortByVolumeTest3() {
		Cuboid c1 = new Cuboid(2,1,4);
		Cuboid c2 = new Cuboid(2,3,4);
		Cuboid.SortByVolume sorted = c1. new SortByVolume();
		assertEquals(-1, sorted.compare(c1, c2));
	}
}
