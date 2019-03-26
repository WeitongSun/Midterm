package pkgShape;

public class Rectangle extends Shape implements Comparable<Object> {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length) {
		
		this.iWidth = width;
		this.iLength = length;
		
		
		if(width <= 0 || length <= 0) {
			throw new IllegalArgumentException ("Invalid");
		}
		
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
		double area = this.iLength*this.iWidth;
		return area;
	}
	
	public double perimeter() throws UnsupportedOperationException {
		return 2*(this.iLength+this.iWidth);
	}
	
	@Override
	public int compareTo(Object o) {
		Rectangle r = (Rectangle) o;
		return (int) (this.area() - r.area());
	 }


}
