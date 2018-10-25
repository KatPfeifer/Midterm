package Shape;

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
			if (a.area()>b.area()) {
				return -1;
			}
			if (a.area()==b.area()) {
				return 0;
			}
			else {
				return 1;
			}
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			if (a.volume()>b.volume()) {
				return 1;
			}
			if (a.volume()==b.volume()) {
				return 0;
			}
			else {
				return -1;
			}
		}
	}
}
