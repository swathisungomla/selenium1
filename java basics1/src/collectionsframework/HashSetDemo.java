package collectionsframework;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<String>();
		cities.add("mahabubnagar");
		cities.add("hyderabad");
		cities.add("nepal");
		cities.add("shadnagar");
		cities.add("mahabubnagar"); /* here i entered same name but when you exicute it dose not
		                               print because hashset does not allow duplicate values*/
		
		
		System.out.println("the cities are = " + cities);
		
		System.out.println("total number of cities are = " + cities.size());
		

	}

}
