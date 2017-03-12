package collectionsframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer , String> flight = new HashMap<Integer , String>();
		
		flight.put(1, "ram");
		flight.put(2,"shyam");
		flight.put(3, "dham");
		flight.put(4, "kim");
		flight.put(5, "dim");
		flight.put(5, "dim"); // hashmap does not allow duplicate values
		System.out.println("The Flight details are");
		 for(Map.Entry m : flight.entrySet()){
			 
			 System.out.println(m.getKey() + "-" + m.getValue());
			 
			 
		 }
		 System.out.println("the number of attendants in flight are" + flight.size());
		
		

	}

}
