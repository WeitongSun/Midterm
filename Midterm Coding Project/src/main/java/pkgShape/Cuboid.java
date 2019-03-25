package pkgShape;

public class Cuboid extends Rectangle  {
	
	private int iDepth;
	
	public Cuboid(int width, int length, int depth) throws IllegalArgumentException{
		super(width,length);
		this.iDepth = depth;
		if(depth <=0) {
			throw new IllegalArgumentException("Invalid");
			
		}
		
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return this.getiLength() * this.getiWidth()* this.iDepth;
		
	}
	
	public double area() {
		double eq = (2*(this.getiLength() * this.getiWidth())+ 2*(this.getiLength()*this.iDepth) + 2*(this.getiWidth()* this.iDepth));
		return eq;
	}
	
	public double perimeter() throws UnsupportedOperationException{
		
		throw new UnsupportedOperationException("Invalid");
	}
	
	public int compareTo(Cuboid other){
	    SortByArea a = new SortByArea();
	    SortByVolume v = new SortByVolume();
	    if(a.compare(this, other) !=0) {
	    	return a.compare(this, other);
	    }
	    else {
	    	return v.compare(this, other);
	    		
	    	}
	    	
	    }
	    	
	    
	
	
	
	

}

