package collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>(); // this is syntax for arraylist
		cities.add("india");
		cities.add("usa");
		cities.add("delhi");
		cities.add("mahabubnagar"); 
		cities.add("hyderabad");//this way we can add any number of cities because arraylist is dynamic
		cities.add("india"); //  here i added same element india, that means arraylist allows duplicate values. you can see in output
		                    
		
		for(String t : cities){  // just writing sysout for all cities is to much code so we are using for-each-loop
			System.out.println(t);
			
			
		}
		
		
		int number = cities.size(); // this syntax is for size of  an arraylist
		System.out.println("the number of cities = " + number);
		
		
		
		
	}

}
