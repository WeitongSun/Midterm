package pkgShape;

import java.util.Comparator;

public class SortByArea implements Comparator<Cuboid> {
	
	public SortByArea() {
		
	}
	
	public int compare(Cuboid a, Cuboid b) {
		if(a.area() > b.area())
			  return 1;
		else if(a.area() < b.area())
			  return -1;
		else
			  return 0;
		
	}


}

