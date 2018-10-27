package Shape;

public class Rectangle extends Shape implements Comparable<Rectangle>{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth=iWidth;
		this.iLength=iLength;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		return iWidth*iLength;
	}
	
	public double perimeter() {
		return iWidth*2+iLength*2;
	}
	
	public int compareTo(Rectangle rect) {
		if (this.area()<rect.area()) {
			return -1;
		}
		if (this.area()==rect.area()) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
