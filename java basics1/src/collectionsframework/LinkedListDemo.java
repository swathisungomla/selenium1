package collectionsframework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<String>();
		cities.add("hyderabad");
		cities.add("mahabubnagar");
		cities.add("kammadanam");
		cities.add("shadnagar");
		cities.add("warangal");
		cities.add("hyderabad");
		
		
		Iterator<String> itr = cities.iterator(); // Iterator interface is used to prin elements on arraylist or linkedlist
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		System.out.println("total number of cities are = " + cities.size());

		
	}

}
