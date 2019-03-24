package pkgShape;

public class Rectangle extends Shape{
	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length)throws IllegalArgumentException {
		
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
		return this.iLength*this.iWidth;
	}
	
	public double perimeter() throws UnsupportedOperationException {
		return 2*(this.iLength+this.iWidth);
	}
	
	public int compareTo(Object other) {
		return (Integer) null;
	}


}
