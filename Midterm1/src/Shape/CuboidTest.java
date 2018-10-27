package Shape;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

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
		Cuboid c1 = new Cuboid(2,10,20);
		Cuboid c2 = new Cuboid(2,3,4);
		Cuboid c3 = new Cuboid(4,2,6);
		ArrayList<Cuboid> unsorted = new ArrayList<Cuboid>();
		unsorted.add(c1);
		unsorted.add(c2);
		unsorted.add(c3);
		
		Cuboid.SortByArea sorter = c1.new SortByArea();
		Collections.sort(unsorted, sorter);
		ArrayList<Cuboid> sortedlist= new ArrayList<Cuboid>();
		sortedlist.add(c2);
		sortedlist.add(c3);
		sortedlist.add(c1);
		assertEquals(sortedlist, unsorted);
		
		ArrayList<Cuboid> wrong = new ArrayList<Cuboid>();
		wrong.add(c2);
		wrong.add(c1);
		wrong.add(c3);
		assertNotEquals(wrong, unsorted);
	}
	
	@Test
	public void SortByVolumeTest() {
		Cuboid c1 = new Cuboid(2,10,20);
		Cuboid c2 = new Cuboid(2,3,4);
		Cuboid c3 = new Cuboid(4,2,6);
		ArrayList<Cuboid> unsorted = new ArrayList<Cuboid>();
		unsorted.add(c1);
		unsorted.add(c2);
		unsorted.add(c3);
		
		Cuboid.SortByVolume sorter = c1.new SortByVolume();
		Collections.sort(unsorted, sorter);
		ArrayList<Cuboid> sortedlist= new ArrayList<Cuboid>();
		sortedlist.add(c2);
		sortedlist.add(c3);
		sortedlist.add(c1);
		assertEquals(sortedlist, unsorted);
		
		ArrayList<Cuboid> wrong = new ArrayList<Cuboid>();
		wrong.add(c2);
		wrong.add(c1);
		wrong.add(c3);
		assertNotEquals(wrong, unsorted);
	}
}
