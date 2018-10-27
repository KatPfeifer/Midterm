package Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cuboid extends Rectangle{
	
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth=iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return iDepth*super.getiLength()*super.getiWidth();
	}
	
	@Override
	public double area() {
		return (2*iDepth*super.getiLength())+(2*iDepth*super.getiWidth())+(2*super.getiLength()*super.getiWidth());
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Invalid Operation for Cuboid");
	}
	
	public class SortByArea implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			return Double.compare(a.area(), b.area());
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			return Double.compare(a.volume(), b.volume());
		}
	}
	
	public int compareTo(Cuboid c) {
		return Double.compare(this.area(), c.area());
	}
}