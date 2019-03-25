package pkgShape;

import java.util.Comparator;

public class SortByVolume implements Comparator<Cuboid> {
	
	public SortByVolume() {
		
	}
	
	public int compare(Cuboid a, Cuboid b) {
		if(a.volume() > b.volume())
			  return 1;
		else if(a.volume() < b.volume())
			  return -1;
		else
			  return 0;
			
	}

}